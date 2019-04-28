package proje;

public abstract class Temelsinif {
	public abstract int getId();

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return getId();
	}

	@Override
	public boolean equals(Object obj) {
		Temelsinif temelSinif = (Temelsinif) obj;
		if (temelSinif.getId() == this.getId()) {
			return true;
		}

		return false;
	}
}
