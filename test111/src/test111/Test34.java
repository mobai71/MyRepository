package test111;

import java.util.AbstractSet;
import java.util.Arrays;

public class Test34 {
	
	
	 public static void moveArrayElement01(int[] array, int k) {
	        int length = array.length;
	        // �����ƶ���λ����newk,��ô���������һ��������ƶ�newk+n*length��λ��֮��,�ƶ�������ԭ����λ��
	        int newk = k % length;
	        int temp = 0;
	        for(int i = 0; i < newk; i++) {
	            // ���temp���������������һ��Ԫ��
	            temp = array[length - 1];
	            for(int j = length - 2; j >= 0; j--) {
	                // �ú�һ��Ԫ�ص���ǰ���Ԫ��,�൱�ں����Ԫ���Ǳ�ǰ���Ԫ�ظ�����
	                array[j+1] = array[j];
	            }
	            // ��һ��Ԫ����ÿһ��ѭ������֮���Ҫ��֮ǰ����ʱ���������ȥ
	            // ��Ϊ��ʱ�����������ÿһ�ε����һ��λ�õ�Ԫ��
	            array[0] = temp;
	        }
	    }

	    /**
	     * ����һ���µ�����,�Ѿɵ�����ֱ�ӷ����������е���ȷ��λ��
	     * @param array
	     * @param k
	     */
	    public static int[] moveArrayElement02(int[] array, int k) {
	        int length = array.length;
	        int newk = k % length;
	        int[] newArray = new int[length];
	        // �ظ�length�ΰ�Ԫ�شӾ�λ���ƶ��͵���λ��
	        for(int i = 0; i < length; i++) {
	            // ���Ԫ���µ�λ��
	            // ע����Ҫȡģ��
	            /**
	             * ����i=6(�������һ��Ԫ��)
	             * �ƶ���λ����3
	             * ��ô (6+3)%7 = 2
	             * ����ԭ�����������Ϊ6(���һ��Ԫ��)
	             * ���������е�����Ϊ2.
	             */
	            int newPosition = (i + newk) % length;
	            newArray[newPosition] = array[i];
	        }
	        return newArray;
	    }
	    


	   /* public static void main(String[] args) {
	        int[] nums = {1,2,3,4,5,6,7};
	        int[] re = moveArrayElement02(nums, 3);
	        System.out.println(Arrays.toString(re));
	    }*/
	   
	
	

}
