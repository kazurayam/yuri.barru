package my

/**
 * Keywords/my/ParamsFacgtory.groovy
 * 
 */
public class ParamsFactory extends LinkedHashMap<String, Object> {

	ParamsFactory(Map<String, Object> defaultValues) {
		super();
		this.putAll(defaultValues);
	}
	
	Map<String, Object> createParams(Map<String, Object> runtimeParams) {
		this.putAll(runtimeParams);
		return this;
	}
}
