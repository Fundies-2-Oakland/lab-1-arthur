import java.math.*;

import static java.lang.Math.acos;


public class Vector3D {

    //
    private double x;
    private double y;
    private double z;

    // Constructor
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Getter
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double getMagnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }


    // Override toString
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }


}
