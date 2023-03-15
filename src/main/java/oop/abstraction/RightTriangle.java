package oop.abstraction;

public class RightTriangle extends TriangleTypes{

    @Override
    public int getArea(int length, int width) {
        return 0;
    }

    @Override
    public int getPerimeter(int length, int width) {
        return 0;
    }

    @Override
    public void printAllSimilarShapes() {

    }

    @Override
    public void printAngle() {
        printInfo();
        printStaticInfo();
        new RightTriangle().printInfo();
        System.out.println(numberOfAngles);
        System.out.println(shape);

//        TriangleTypes triangleTypes = new TriangleTypes();
    }



}
