package com.arcagile.output;

import com.arcagile.output.impl.JsonOutputGenerator;

public class OutputHelper {
	IOutputGenerator outputGenerator;

	public void generateOutput() {
		outputGenerator.generateOutput();
	}

	//DI via constructor
	public OutputHelper(JsonOutputGenerator jsonOutputGenerator){
		this.outputGenerator = outputGenerator;
	}
	
}