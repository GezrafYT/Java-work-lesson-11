public class Circle {
    private double radius;
    private Point center;
    public Circle(int x, int y, double radius)
    {
        this.radius = radius;
        this.center = new Point(x, y);
    }

    public Circle(Circle other)
    {
        this.center = other.center;
        this.radius = other.radius;
    }

    public Circle(Point center, double radius)
    {
        this.radius = radius;
        this.center = center;
    }


    public double getRadius()
    {
        return this.radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public Point getCenter()
    {
        return this.center;
    }


    public void setCenter(Point center)
    {
        this.center = center;
    }

    public double perimeter()
    {
        return 2 * Math.PI * this.radius;
    }

    public double area()
    {
        return Math.PI * (this.radius * this.radius);
    }

    public void move(int deltaX, int deltaY)
    {
        this.center = new Point(deltaX, deltaY);
    }

    public boolean equals(Circle other)
    {
        if(this.radius == other.radius)
        {
            return true;
        }

        return false;
    }

    public boolean isLarger(Circle other)
    {
        if (this.area() > other.area())
        {
            return true;
        }

        return false;
    }


    public boolean isInCircle(Point p)
    {
        if (p.distance(this.center) < this.radius)
        {
            return true;
        }

        return false;
    }

    public String toString()
    {
        return("The center of the circle = (" + this.center.getX() + ", " + this.center.getY() + ") " + "and the radius = " + this.radius);
    }

}
