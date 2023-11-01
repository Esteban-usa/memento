package modelo;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class GameState {

    private Player player;
    private List<Checkpoint> checkpoints;
    private Checkpoint checkpoint, checkpoint2, checkpoint3, checkpoint4;

    public GameState() {
        player = new Player(Buffered.imageLoader("D:\\Universidad\\semestre 6\\Patrones\\memento\\src\\img\\cubo.png"),
                20, 450, 50, 50, 5);

        checkpoints = new ArrayList<>();

        checkpoints.add(new Checkpoint(
                Buffered.imageLoader("D:\\Universidad\\semestre 6\\Patrones\\memento\\src\\img\\check.png"), 200, 20,
                50, 50, false));

        checkpoints.add(new Checkpoint(
                Buffered.imageLoader("D:\\Universidad\\semestre 6\\Patrones\\memento\\src\\img\\check.png"), 400, 20,
                50, 50, false));

        checkpoints.add(new Checkpoint(
                Buffered.imageLoader("D:\\Universidad\\semestre 6\\Patrones\\memento\\src\\img\\check.png"), 20, 200,
                50, 50, false));

        checkpoints.add(new Checkpoint(
                Buffered.imageLoader("D:\\Universidad\\semestre 6\\Patrones\\memento\\src\\img\\check.png"), 20, 400,
                50, 50, false));
    }

    public void update() {
        player.update();

        // Verifica colisiones con todos los checkpoints
        for (Checkpoint checkpoint : checkpoints) {
            if (player.getBounds().intersects(checkpoint.getBounds()) && !checkpoint.isUsado()) {
                checkpoint.setUsado(true);
                player.Memento();
            }
        }
    }

    public void draw(Graphics g) {
        for (Checkpoint checkpoint : checkpoints) {
            checkpoint.draw(g);
        }
        player.draw(g);
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Checkpoint getCheckpoint() {
        return checkpoint;
    }

    public void setCheckpoint(Checkpoint checkpoint) {
        this.checkpoint = checkpoint;
    }

}
