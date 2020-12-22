package koschei.composite;
import java.util.Optional;
public abstract class Composite {
	private Composite child;
	public Composite(Composite child) {
		this.child = child;
	}
	public Composite() {}
	public abstract String getMessage();
	
	@Override
	public String toString() {
		return Optional.ofNullable(child)
			.map(ch -> getMessage() + ch).orElseGet(this::getMessage);
	}
}