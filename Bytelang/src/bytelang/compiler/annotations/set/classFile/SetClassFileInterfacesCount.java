package bytelang.compiler.annotations.set.classFile;

import bytelang.classes.ClassFile;
import bytelang.compiler.annotations.AnnotationSet.ClassCommandProcessor;
import bytelang.parser.container.values.Value;
import bytelang.parser.container.values.ValueInteger;
import bytelang.parser.container.values.ValueType;

public class SetClassFileInterfacesCount implements ClassCommandProcessor {
	@Override
	public void apply(Value value, ClassFile classFile) {
		if (value.getType() == ValueType.INTEGER) {
			classFile.interfacesCount = (int) ((ValueInteger) value).getValue();
		}
	}
}
