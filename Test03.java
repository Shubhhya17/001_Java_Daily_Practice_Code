enum Direction{
    East, West, north, South;
}
class Test03 {
    public static void main(String args[]){
        Direction[] d1 = Direction.values();
        for(Direction res : d1 ){
            System.out.println(res + "..."+res.ordinal());
        }
    }
    
}
