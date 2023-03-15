package oop.encapsulation;

  public class Area {
      int length;
      int width;


   public Area(int length, int width){
      this.length = length;
      this.width = width;
}
   public int getArea(){
       System.out.println(length * width);
       return length * width;
   }

      public static void main(String ... args) {
          Area area = new Area(2,5);
          area.getArea();
      }

}
