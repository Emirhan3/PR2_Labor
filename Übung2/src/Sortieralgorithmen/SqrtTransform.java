package Sortieralgorithmen;

/*
 * Original Version
 * Schildt, H.: Java. The Complete Reference,
 * Ninth Edition, Oracle Press, 2014, Pages 952-954
 */

import java.util.concurrent.RecursiveAction;

public class SqrtTransform extends RecursiveAction {
	private static final long serialVersionUID = 1L;

	final int seqThreshold = 1000;
	
	double[] data;
	
	int start, end;
	
	SqrtTransform(double[] vals, int s, int e) {
		data = vals;
		start = s;
		end = e;
	}
	
	protected void compute() {
		if((end - start) < seqThreshold) {
			for(int i = start; i < end; i++) {
				data[i] = Math.sqrt(data[i]);
			}
		}
		else {
			int middle = (start + end) / 2;
			
			invokeAll(new SqrtTransform(data, start, middle),
					new SqrtTransform(data, middle, end));
		}
	}
}

