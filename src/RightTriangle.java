public class RightTriangle {
    public boolean isRightTriangle(Triangle triangle){
        boolean status = false;
        if(Math.pow(triangle.getA(), 2) + Math.pow(triangle.getB(), 2) == Math.pow(triangle.getC(), 2)){
            status=true;
        }
        else if (Math.pow(triangle.getA(), 2) + Math.pow(triangle.getC(), 2) == Math.pow(triangle.getB(), 2)){
            status=true;
        }
        else if (Math.pow(triangle.getB(), 2) + Math.pow(triangle.getC(), 2) == Math.pow(triangle.getA(), 2)){
            status=true;
        }
        else System.out.println(":(");
        return status;
    }
}
