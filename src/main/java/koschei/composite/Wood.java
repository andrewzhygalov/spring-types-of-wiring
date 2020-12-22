package koschei.composite;
import org.springframework.stereotype.Component;

@Component
public class Wood extends Composite {
	public Wood(Composite rabbit) {
		super(rabbit);
	} 
	public String getMessage() {
		return ", на дереве заяц ";
	}
}