package magacin;

import java.util.Date;

public class KucnaHemija {

	private Date rokTrajanja;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rokTrajanja == null) ? 0 : rokTrajanja.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KucnaHemija other = (KucnaHemija) obj;
		if (rokTrajanja == null) {
			if (other.rokTrajanja != null)
				return false;
		} else if (!rokTrajanja.equals(other.rokTrajanja))
			return false;
		return true;
	}

	public Date getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(Date rokTrajanja) {
		if (rokTrajanja == null) {
			throw new IllegalArgumentException();
		}
		this.rokTrajanja = rokTrajanja;
	}

	@Override
	public String toString() {
		return "KucnaHemija [rokTrajanja=" + rokTrajanja + "]";
	}

}
