package copyconstructor.model;

public class PointOne {
    protected Integer x;
    protected Integer y;
 
    public PointOne(PointOne point){
        this.x = point.x;
        this.y = point.y;
    }

	public PointOne(int i, int j) {
		x=i;
		y=j;
	}
	
	@Override
	public String toString() {
		return "X: "+x+" Y: "+y;
	}
}
