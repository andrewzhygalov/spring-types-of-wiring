package koschei.composite;
import org.springframework.stereotype.Component;

@Component
public class Koschei extends Composite {
	public Koschei(Composite ocean) {
		super(ocean);
	} 
	public String getMessage() {
		return "На свете есть океан , ";
	}
}