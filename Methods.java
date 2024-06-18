class Methods {
    /* no arguments , no return value */
    public void display() {
        System.out.println("Working eith methods");
    }
    /* with arguments , no return value */
    public void empSal(int sal1,int sal2) {
        long total=sal1+sal2;
        System.out.println("total salary is " + total);
    }
    /* no arguments , with return value */
    public String hello(){
        return "HlloWorld";
    }/* with argument , with retun value */
    public int ren(int a,int b){
        return a*b;
    } 
}
class main {
    public static void main(String[]args){
        Methods ob=new Methods();
        ob.display();
        ob.empSal(1000,1000);
        System.out.println(ob.hello());
        System.out.println(ob.ren(4,6));
    }
}
