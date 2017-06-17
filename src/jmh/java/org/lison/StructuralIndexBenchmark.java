package org.lison;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.Throughput)
@Fork(2)
@Measurement(iterations = 10)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 5)
public class StructuralIndexBenchmark {
    @Benchmark
    public void buildStructuralCharacterBitmaps() {
        int a = 1;
        int b = 2;
        int sum = a + b;
    }
}
