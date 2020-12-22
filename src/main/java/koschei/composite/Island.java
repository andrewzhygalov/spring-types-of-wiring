package koschei.composite;
import org.springframework.stereotype.Component;

@Component
public class Island extends Composite {
	public Island(Composite wood) {
		super(wood);
	} 
	public String getMessage() {
		return ", на острове дерево ";
	}
}