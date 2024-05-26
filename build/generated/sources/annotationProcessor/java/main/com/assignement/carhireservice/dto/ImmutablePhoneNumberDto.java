package com.assignement.carhireservice.dto;

import com.assignement.carhireservice.constants.PhoneType;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link PhoneNumberDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePhoneNumberDto.builder()}.
 */
@Generated(from = "PhoneNumberDto", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutablePhoneNumberDto implements PhoneNumberDto {
  private final String phoneNumber;
  private final PhoneType phoneType;

  private ImmutablePhoneNumberDto(String phoneNumber, PhoneType phoneType) {
    this.phoneNumber = phoneNumber;
    this.phoneType = phoneType;
  }

  /**
   * @return The value of the {@code phoneNumber} attribute
   */
  @JsonProperty("phoneNumber")
  @Override
  public String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * @return The value of the {@code phoneType} attribute
   */
  @JsonProperty("phoneType")
  @Override
  public PhoneType getPhoneType() {
    return phoneType;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhoneNumberDto#getPhoneNumber() phoneNumber} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for phoneNumber
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhoneNumberDto withPhoneNumber(String value) {
    String newValue = Objects.requireNonNull(value, "phoneNumber");
    if (this.phoneNumber.equals(newValue)) return this;
    return new ImmutablePhoneNumberDto(newValue, this.phoneType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhoneNumberDto#getPhoneType() phoneType} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for phoneType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhoneNumberDto withPhoneType(PhoneType value) {
    PhoneType newValue = Objects.requireNonNull(value, "phoneType");
    if (this.phoneType == newValue) return this;
    return new ImmutablePhoneNumberDto(this.phoneNumber, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePhoneNumberDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePhoneNumberDto
        && equalTo(0, (ImmutablePhoneNumberDto) another);
  }

  private boolean equalTo(int synthetic, ImmutablePhoneNumberDto another) {
    return phoneNumber.equals(another.phoneNumber)
        && phoneType.equals(another.phoneType);
  }

  /**
   * Computes a hash code from attributes: {@code phoneNumber}, {@code phoneType}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + phoneNumber.hashCode();
    h += (h << 5) + phoneType.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PhoneNumberDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "PhoneNumberDto{"
        + "phoneNumber=" + phoneNumber
        + ", phoneType=" + phoneType
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "PhoneNumberDto", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements PhoneNumberDto {
    String phoneNumber;
    PhoneType phoneType;
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
    }
    @JsonProperty("phoneType")
    public void setPhoneType(PhoneType phoneType) {
      this.phoneType = phoneType;
    }
    @Override
    public String getPhoneNumber() { throw new UnsupportedOperationException(); }
    @Override
    public PhoneType getPhoneType() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePhoneNumberDto fromJson(Json json) {
    ImmutablePhoneNumberDto.Builder builder = ImmutablePhoneNumberDto.builder();
    if (json.phoneNumber != null) {
      builder.phoneNumber(json.phoneNumber);
    }
    if (json.phoneType != null) {
      builder.phoneType(json.phoneType);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PhoneNumberDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PhoneNumberDto instance
   */
  public static ImmutablePhoneNumberDto copyOf(PhoneNumberDto instance) {
    if (instance instanceof ImmutablePhoneNumberDto) {
      return (ImmutablePhoneNumberDto) instance;
    }
    return ImmutablePhoneNumberDto.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePhoneNumberDto ImmutablePhoneNumberDto}.
   * <pre>
   * ImmutablePhoneNumberDto.builder()
   *    .phoneNumber(String) // required {@link PhoneNumberDto#getPhoneNumber() phoneNumber}
   *    .phoneType(com.assignement.carhireservice.constants.PhoneType) // required {@link PhoneNumberDto#getPhoneType() phoneType}
   *    .build();
   * </pre>
   * @return A new ImmutablePhoneNumberDto builder
   */
  public static ImmutablePhoneNumberDto.Builder builder() {
    return new ImmutablePhoneNumberDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePhoneNumberDto ImmutablePhoneNumberDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PhoneNumberDto", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_PHONE_NUMBER = 0x1L;
    private static final long INIT_BIT_PHONE_TYPE = 0x2L;
    private long initBits = 0x3L;

    private String phoneNumber;
    private PhoneType phoneType;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PhoneNumberDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PhoneNumberDto instance) {
      Objects.requireNonNull(instance, "instance");
      this.phoneNumber(instance.getPhoneNumber());
      this.phoneType(instance.getPhoneType());
      return this;
    }

    /**
     * Initializes the value for the {@link PhoneNumberDto#getPhoneNumber() phoneNumber} attribute.
     * @param phoneNumber The value for phoneNumber 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("phoneNumber")
    public final Builder phoneNumber(String phoneNumber) {
      this.phoneNumber = Objects.requireNonNull(phoneNumber, "phoneNumber");
      initBits &= ~INIT_BIT_PHONE_NUMBER;
      return this;
    }

    /**
     * Initializes the value for the {@link PhoneNumberDto#getPhoneType() phoneType} attribute.
     * @param phoneType The value for phoneType 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("phoneType")
    public final Builder phoneType(PhoneType phoneType) {
      this.phoneType = Objects.requireNonNull(phoneType, "phoneType");
      initBits &= ~INIT_BIT_PHONE_TYPE;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePhoneNumberDto ImmutablePhoneNumberDto}.
     * @return An immutable instance of PhoneNumberDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePhoneNumberDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePhoneNumberDto(phoneNumber, phoneType);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_PHONE_NUMBER) != 0) attributes.add("phoneNumber");
      if ((initBits & INIT_BIT_PHONE_TYPE) != 0) attributes.add("phoneType");
      return "Cannot build PhoneNumberDto, some of required attributes are not set " + attributes;
    }
  }
}
