package io.dolphin.jvm.memoryallocate;

/**
 * @Description:
 * @Author: qianliang
 * @Since: 2020-3-6 16:44
 */
public class PretenureSizeThresholdTest {
    private static final int _1MB = 1024 * 1024;

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // 直接分配在老年代
        byte[] b1 = new byte[4 * _1MB];
    }
}
