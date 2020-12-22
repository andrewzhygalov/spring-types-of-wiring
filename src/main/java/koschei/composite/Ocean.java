package koschei.composite;
import org.springframework.stereotype.Component;

@Component
public class Ocean extends Composite {
	public Ocean(Composite island) {
		super(island);
	} 
	public String getMessage() {
		return "на океане остров ";
	}
}