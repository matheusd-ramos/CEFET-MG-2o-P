public class Ponto2D {
    private double X;
    private double Y;

    public Ponto2D(){
        X = 0;
        Y = 0;
    }

    public Ponto2D(double X, double Y){
        this.X = X;
        this.Y = Y;
    }

    public Ponto2D(Ponto2D ponto2d){
        setX(ponto2d.getX());
        setY(ponto2d.getY());
    }
    
    public double getX() {
        return X;
    }

    public double calculaDistancia(Ponto2D ponto2d){
        return Math.sqrt(Math.pow(X - ponto2d.getX(), 2) + Math.pow(Y - ponto2d.getY(), 2));
    }

    public void setX(double X) {
        this.X = X;
    }
    
    public double getY() {
        return Y;
    }

    public void setY(double Y) {
        this.Y = Y;
    }
}
