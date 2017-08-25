public class Box{
    double width, height, depth;
    void getData(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    double volume(){
        double v;
        v = width*height*depth;
        return v;
    }
}