package copyconstructor.model;

public class PointTwo extends PointOne{
    private Integer z;
 
    public PointTwo(PointTwo point){
        super(point); //Call Super class constructor here
        this.z = point.z;
    }

	public PointTwo(int i, int j, int k) {
		super(i,j);
		z=k;
	}
	
	@Override
	public String toString() {
		return super.toString() +" Z: "+z;
	}
}