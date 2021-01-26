package ru.warehouse.planner;

public class Main {
    public static void main(String... args) {
        Point point = new Point();
        point.SetX(0);
        point.SetY(0);

        Triangle triangle = new Triangle();
        triangle.setPoint1(point);

        point.SetX(2);
        point.SetY(4);

        triangle.setPoint2(point);

        point.SetX(2);
        point.SetY(0);

        triangle.setPoint3(point);

        System.out.println(triangle);
    }

    private static class Triangle {
        private Point point1;

        private Point point2;

        private Point point3;

        public Point getPoint1() {
            return point1;
        }

        public void setPoint1(Point point1) {
            this.point1 = point1;
        }

        public Point getPoint2() {
            return point2;
        }

        public void setPoint2(Point point2) {
            this.point2 = point2;
        }

        public Point getPoint3() {
            return point3;
        }

        public void setPoint3(Point point3) {
            this.point3 = point3;
        }

        @Override
        public String toString() {
            return "Triangle{" +
                    "point1=" + point1 +
                    ", point2=" + point2 +
                    ", point3=" + point3 +
                    '}';
        }
    }
}
