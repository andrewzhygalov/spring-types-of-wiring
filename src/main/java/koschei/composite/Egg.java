package koschei.composite;
import org.springframework.stereotype.Component;

@Component
public class Egg extends Composite {
	public Egg(Composite needle) {
		super(needle);
	} 
	public String getMessage() {
		return ", в яйце иголка ";
	}
}