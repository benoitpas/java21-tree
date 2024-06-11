package org.benoit;

public record WithId<T>(Integer id, T value) {
}
