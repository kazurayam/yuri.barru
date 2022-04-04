package my

/**
 * Keywords/my/Params.groovy
 * 
 */
public class Params extends LinkedHashMap<String, Object> {
	
	private static final Map<String, Object> defaultValues = 
		[
			"foo": 0,
			"bar": "default_bar",
			"baz": false,
			
		]
	
	Params(Map<String, Object> values) {
		super();
		this.putAll(defaultValues);
		this.putAll(values);
	}
	
}
