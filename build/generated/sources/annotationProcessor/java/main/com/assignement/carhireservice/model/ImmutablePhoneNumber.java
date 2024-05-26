package com.assignement.carhireservice.model;

import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link PhoneNumber}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePhoneNumber.builder()}.
 */
@Generated(from = "PhoneNumber", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutablePhoneNumber extends PhoneNumber {

  private ImmutablePhoneNumber(ImmutablePhoneNumber.Builder builder) {
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePhoneNumber} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePhoneNumber
        && equalTo(0, (ImmutablePhoneNumber) another);
  }

  @SuppressWarnings("MethodCanBeStatic")
  private boolean equalTo(int synthetic, ImmutablePhoneNumber another) {
    return true;
  }

  /**
   * Returns a constant hash code value.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    return -1428380009;
  }

  /**
   * Prints the immutable value {@code PhoneNumber}.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "PhoneNumber{}";
  }

  /**
   * Creates an immutable copy of a {@link PhoneNumber} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PhoneNumber instance
   */
  public static ImmutablePhoneNumber copyOf(PhoneNumber instance) {
    if (instance instanceof ImmutablePhoneNumber) {
      return (ImmutablePhoneNumber) instance;
    }
    return ImmutablePhoneNumber.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePhoneNumber ImmutablePhoneNumber}.
   * <pre>
   * ImmutablePhoneNumber.builder()
   *    .build();
   * </pre>
   * @return A new ImmutablePhoneNumber builder
   */
  public static ImmutablePhoneNumber.Builder builder() {
    return new ImmutablePhoneNumber.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePhoneNumber ImmutablePhoneNumber}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PhoneNumber", generator = "Immutables")
  public static final class Builder {

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PhoneNumber} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PhoneNumber instance) {
      Objects.requireNonNull(instance, "instance");
      return this;
    }

    /**
     * Builds a new {@link ImmutablePhoneNumber ImmutablePhoneNumber}.
     * @return An immutable instance of PhoneNumber
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePhoneNumber build() {
      return new ImmutablePhoneNumber(this);
    }
  }
}
