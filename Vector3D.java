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

    public Vector3D normalize() {
        double mag = getMagnitude();
        if (mag == 0) {
            throw new IllegalArgumentException("Magnitude is zero");
        } else {
            return new Vector3D(x / mag, y / mag, z / mag);
        }
    }

    public Vector3D add(Vector3D vector) {
        return new Vector3D(x + vector.getX(), y + vector.getY(), z + vector.getZ());
    }

    public Vector3D multiply(double scalar) {
        return new Vector3D(x * scalar, y * scalar, z * scalar);
    }

    public double dotProduct(Vector3D vector) {
        return (x * vector.getX() + y * vector.getY() + z * vector.getZ());
    }

    public double angleBetween(Vector3D vector) {
        return Math.acos(dotProduct(vector)/(getMagnitude() * vector.getMagnitude()));
    }

    public Vector3D crossProduct(Vector3D vector) {
        double xnew = y * vector.getZ() - z * vector.getY();
        double ynew = z * vector.getX() - x * vector.getZ();
        double znew = x * vector.getY() - y * vector.getX();
        return new Vector3D(xnew, ynew, znew);
    }


    // Override toString
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
