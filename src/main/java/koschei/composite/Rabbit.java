package koschei.composite;
import org.springframework.stereotype.Component;

@Component
public class Rabbit extends Composite {
	public Rabbit(Composite duck) {
		super(duck);
	} 
	public String getMessage() {
		return ", в зайце утка ";
	}
}