package koschei.composite;
import org.springframework.stereotype.Component;

@Component
public class Duck extends Composite {
	public Duck(Composite egg) {
		super(egg);
	} 
	public String getMessage() {
		return ", в утке яйцо ";
	}
}