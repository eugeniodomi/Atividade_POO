package cofrinho.virtual;

public class Real extends Moeda {

	public Real(double value) {
		
		this.value = value;
		
}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double converter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public boolean equals(Object object) {
		if(this.getClass() != object.getClass()) {
			return false;
		}
		
		Real realObject = (Real) object;
		
		
		if(this.value != realObject.value) {
			return false;
		}
		
		return true;

	}
}


