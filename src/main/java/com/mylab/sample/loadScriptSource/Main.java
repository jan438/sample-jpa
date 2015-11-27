package com.mylab.sample.loadScriptSource;

import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {

		Persistence.generateSchema("sampleJPALoadScriptSourcePU", null);
	}
}
