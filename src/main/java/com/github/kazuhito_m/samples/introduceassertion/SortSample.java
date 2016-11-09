package com.github.kazuhito_m.samples.introduceassertion;

public class SortSample {

    private final int[] _data;

    public SortSample(int[] data) {
        _data = new int[data.length];
        System.arraycopy(data, 0, _data, 0, data.length);
    }

    public void sort() {
        for (int x = 0; x < _data.length - 1; x++) {
            int m = x;
            for (int y = x + 1; y < _data.length; y++) {
                if (_data[m] > _data[y]) {
                    m = y;
                }
            }
            // ここで _data[m] は _data[x] 〜 _data[_data.length - 1] の最小値のはず
            int v = _data[m];
            _data[m] = _data[x];
            _data[x] = v;
            // ここで _data[0] 〜 _data[x + 1] はソート済みのはず
        }
    }

    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("[ ");
        for (int i = 0; i < _data.length; i++) {
            buffer.append(_data[i]);
            buffer.append(", ");
        }
        buffer.append("]");
        return buffer.toString();
    }

}
