import java.awt.*;

/**
 * Created by blackwidow on 11/10/16.
 */
public abstract class Area extends Forma {

    private int width, height;
    private boolean rellenar = false;

    public boolean isRellenar() {
        return rellenar;
    }

    public void setRellenar(boolean rellenar) {
        this.rellenar = rellenar;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void pintarForma(Graphics g) {

    }
}
