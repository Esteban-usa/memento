package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import controlador.Controlador;

public class Vista extends JFrame implements Runnable {

    public static final int WIDTH = 1000, HEIGHT = 800;
    private Canvas canvas;
    private Controlador c;
    private BufferStrategy bs;
    private Graphics g;
    private Thread thread;
    private boolean running = false;
    private int FPS = 60;
    private JPanel bottomPanel;
    private JButton yourButton, yourButton2;

    public Vista(Controlador c) {
        this.c = c;
        initComponents();
        setVisible(true);
        start();
    }

    public void initComponents() {
        setTitle("Contra");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        canvas = new Canvas();

        canvas.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        canvas.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        canvas.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        canvas.setFocusable(true);

        add(canvas);

        // Crear el JPanel para el botón
        bottomPanel = new JPanel();
        bottomPanel.setPreferredSize(new Dimension(WIDTH, 50));
        bottomPanel.setBackground(Color.GRAY);

        // Crear el botón y agregarlo al JPanel
        yourButton = new JButton("CTRL Z");
        yourButton.addActionListener(e -> {
            c.gameState.getPlayer().DesMemento();
        });

        yourButton2 = new JButton("CTRL Y");
        yourButton2.addActionListener(e -> {
            c.gameState.getPlayer().ResMemento();
        });

        bottomPanel.add(yourButton);
        bottomPanel.add(yourButton2);

        // Agregar el JPanel al JFrame en la posición sur (parte inferior)
        add(bottomPanel, BorderLayout.SOUTH);


        // Crear el JPanel para el botón
        bottomPanel = new JPanel();
        bottomPanel.setPreferredSize(new Dimension(WIDTH, 50));
        bottomPanel.setBackground(Color.GRAY);

        // Crear el botón y agregarlo al JPanel
        yourButton = new JButton("CTRL Z");
        yourButton.addActionListener(e -> {
            c.gameState.getPlayer().DesMemento();
        });

        yourButton2 = new JButton("CTRL Y");
        yourButton2.addActionListener(e -> {
            c.gameState.getPlayer().ResMemento();
        });

        bottomPanel.add(yourButton);
        bottomPanel.add(yourButton2);

        // Agregar el JPanel al JFrame en la posición sur (parte inferior)
        add(bottomPanel, BorderLayout.SOUTH);


        // Crear el JPanel para el botón
        bottomPanel = new JPanel();
        bottomPanel.setPreferredSize(new Dimension(WIDTH, 50));
        bottomPanel.setBackground(Color.GRAY);

        // Crear el botón y agregarlo al JPanel
        yourButton = new JButton("CTRL Z");
        yourButton.addActionListener(e -> {
            c.gameState.getPlayer().DesMemento();
        });

        yourButton2 = new JButton("CTRL Y");
        yourButton2.addActionListener(e -> {
            c.gameState.getPlayer().ResMemento();
        });

        bottomPanel.add(yourButton);
        bottomPanel.add(yourButton2);

        // Agregar el JPanel al JFrame en la posición sur (parte inferior)
        add(bottomPanel, BorderLayout.SOUTH);

        canvas.addKeyListener(c.keyboard);
    }

    public void rr() {
        this.repaint();
    }

    @Override
    public void run() {

        double drawInterval = 1000000000 / FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;

        while (running) {
            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            lastTime = currentTime;

            if (delta > 1) {
                update();
                draw();
                delta--;
            }

        }

        stop();
    }

    private void update() {
        c.gameState.update();
        c.keyboard.update();
    }

    private void draw() {

        bs = canvas.getBufferStrategy();

        if (bs == null) {
            canvas.createBufferStrategy(3);
            return;
        }

        g = bs.getDrawGraphics();

        // -----------------------

        g.setColor(Color.BLACK);

        g.fillRect(0, 0, WIDTH, HEIGHT);

        c.gameState.draw(g);

        // ---------------------
        g.dispose();
        bs.show();
    }

    public void start() {
        thread = new Thread(this);
        thread.start();
        running = true;
    }

    private void stop() {
        try {
            thread.join();
            running = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
