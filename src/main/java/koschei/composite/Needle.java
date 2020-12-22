package koschei.composite;
import org.springframework.stereotype.Component;

@Component
public class Needle extends Composite {
	public String getMessage() {
		return ", смерть Кощея на игле :( ";
	}
}