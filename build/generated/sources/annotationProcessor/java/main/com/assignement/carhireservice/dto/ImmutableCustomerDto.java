package com.assignement.carhireservice.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;
import org.springframework.lang.Nullable;

/**
 * Immutable implementation of {@link CustomerDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCustomerDto.builder()}.
 */
@Generated(from = "CustomerDto", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableCustomerDto implements CustomerDto {
  private final String firstName;
  private final String lastName;
  private final String dob;
  private final @Nullable AddressDto address;
  private final @Nullable List<PhoneNumberDto> phoneNumbers;

  private ImmutableCustomerDto(
      String firstName,
      String lastName,
      String dob,
      @Nullable AddressDto address,
      @Nullable List<PhoneNumberDto> phoneNumbers) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dob = dob;
    this.address = address;
    this.phoneNumbers = phoneNumbers;
  }

  /**
   * @return The value of the {@code firstName} attribute
   */
  @JsonProperty("firstName")
  @Override
  public String getFirstName() {
    return firstName;
  }

  /**
   * @return The value of the {@code lastName} attribute
   */
  @JsonProperty("lastName")
  @Override
  public String getLastName() {
    return lastName;
  }

  /**
   * @return The value of the {@code dob} attribute
   */
  @JsonProperty("dob")
  @Override
  public String getDob() {
    return dob;
  }

  /**
   * @return The value of the {@code address} attribute
   */
  @JsonProperty("address")
  @Override
  public @Nullable AddressDto getAddress() {
    return address;
  }

  /**
   * @return The value of the {@code phoneNumbers} attribute
   */
  @JsonProperty("phoneNumbers")
  @Override
  public @Nullable List<PhoneNumberDto> getPhoneNumbers() {
    return phoneNumbers;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CustomerDto#getFirstName() firstName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for firstName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCustomerDto withFirstName(String value) {
    String newValue = Objects.requireNonNull(value, "firstName");
    if (this.firstName.equals(newValue)) return this;
    return new ImmutableCustomerDto(newValue, this.lastName, this.dob, this.address, this.phoneNumbers);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CustomerDto#getLastName() lastName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCustomerDto withLastName(String value) {
    String newValue = Objects.requireNonNull(value, "lastName");
    if (this.lastName.equals(newValue)) return this;
    return new ImmutableCustomerDto(this.firstName, newValue, this.dob, this.address, this.phoneNumbers);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CustomerDto#getDob() dob} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dob
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCustomerDto withDob(String value) {
    String newValue = Objects.requireNonNull(value, "dob");
    if (this.dob.equals(newValue)) return this;
    return new ImmutableCustomerDto(this.firstName, this.lastName, newValue, this.address, this.phoneNumbers);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CustomerDto#getAddress() address} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for address (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCustomerDto withAddress(@Nullable AddressDto value) {
    if (this.address == value) return this;
    return new ImmutableCustomerDto(this.firstName, this.lastName, this.dob, value, this.phoneNumbers);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link CustomerDto#getPhoneNumbers() phoneNumbers}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCustomerDto withPhoneNumbers(@Nullable PhoneNumberDto... elements) {
    if (elements == null) {
      return new ImmutableCustomerDto(this.firstName, this.lastName, this.dob, this.address, null);
    }
    List<PhoneNumberDto> newValue = Arrays.asList(elements) == null ? null : createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableCustomerDto(this.firstName, this.lastName, this.dob, this.address, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link CustomerDto#getPhoneNumbers() phoneNumbers}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of phoneNumbers elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCustomerDto withPhoneNumbers(@Nullable Iterable<? extends PhoneNumberDto> elements) {
    if (this.phoneNumbers == elements) return this;
    List<PhoneNumberDto> newValue = elements == null ? null : createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableCustomerDto(this.firstName, this.lastName, this.dob, this.address, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCustomerDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCustomerDto
        && equalTo(0, (ImmutableCustomerDto) another);
  }

  private boolean equalTo(int synthetic, ImmutableCustomerDto another) {
    return firstName.equals(another.firstName)
        && lastName.equals(another.lastName)
        && dob.equals(another.dob)
        && Objects.equals(address, another.address)
        && Objects.equals(phoneNumbers, another.phoneNumbers);
  }

  /**
   * Computes a hash code from attributes: {@code firstName}, {@code lastName}, {@code dob}, {@code address}, {@code phoneNumbers}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + firstName.hashCode();
    h += (h << 5) + lastName.hashCode();
    h += (h << 5) + dob.hashCode();
    h += (h << 5) + Objects.hashCode(address);
    h += (h << 5) + Objects.hashCode(phoneNumbers);
    return h;
  }

  /**
   * Prints the immutable value {@code CustomerDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "CustomerDto{"
        + "firstName=" + firstName
        + ", lastName=" + lastName
        + ", dob=" + dob
        + ", address=" + address
        + ", phoneNumbers=" + phoneNumbers
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CustomerDto", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CustomerDto {
    String firstName;
    String lastName;
    String dob;
    AddressDto address;
    List<PhoneNumberDto> phoneNumbers = null;
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
      this.firstName = firstName;
    }
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
      this.lastName = lastName;
    }
    @JsonProperty("dob")
    public void setDob(String dob) {
      this.dob = dob;
    }
    @JsonProperty("address")
    public void setAddress(@Nullable AddressDto address) {
      this.address = address;
    }
    @JsonProperty("phoneNumbers")
    public void setPhoneNumbers(@Nullable List<PhoneNumberDto> phoneNumbers) {
      this.phoneNumbers = phoneNumbers;
    }
    @Override
    public String getFirstName() { throw new UnsupportedOperationException(); }
    @Override
    public String getLastName() { throw new UnsupportedOperationException(); }
    @Override
    public String getDob() { throw new UnsupportedOperationException(); }
    @Override
    public AddressDto getAddress() { throw new UnsupportedOperationException(); }
    @Override
    public List<PhoneNumberDto> getPhoneNumbers() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCustomerDto fromJson(Json json) {
    ImmutableCustomerDto.Builder builder = ImmutableCustomerDto.builder();
    if (json.firstName != null) {
      builder.firstName(json.firstName);
    }
    if (json.lastName != null) {
      builder.lastName(json.lastName);
    }
    if (json.dob != null) {
      builder.dob(json.dob);
    }
    if (json.address != null) {
      builder.address(json.address);
    }
    if (json.phoneNumbers != null) {
      builder.addAllPhoneNumbers(json.phoneNumbers);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CustomerDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CustomerDto instance
   */
  public static ImmutableCustomerDto copyOf(CustomerDto instance) {
    if (instance instanceof ImmutableCustomerDto) {
      return (ImmutableCustomerDto) instance;
    }
    return ImmutableCustomerDto.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCustomerDto ImmutableCustomerDto}.
   * <pre>
   * ImmutableCustomerDto.builder()
   *    .firstName(String) // required {@link CustomerDto#getFirstName() firstName}
   *    .lastName(String) // required {@link CustomerDto#getLastName() lastName}
   *    .dob(String) // required {@link CustomerDto#getDob() dob}
   *    .address(com.assignement.carhireservice.dto.AddressDto | null) // nullable {@link CustomerDto#getAddress() address}
   *    .phoneNumbers(List&amp;lt;com.assignement.carhireservice.dto.PhoneNumberDto&amp;gt; | null) // nullable {@link CustomerDto#getPhoneNumbers() phoneNumbers}
   *    .build();
   * </pre>
   * @return A new ImmutableCustomerDto builder
   */
  public static ImmutableCustomerDto.Builder builder() {
    return new ImmutableCustomerDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCustomerDto ImmutableCustomerDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CustomerDto", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_FIRST_NAME = 0x1L;
    private static final long INIT_BIT_LAST_NAME = 0x2L;
    private static final long INIT_BIT_DOB = 0x4L;
    private long initBits = 0x7L;

    private String firstName;
    private String lastName;
    private String dob;
    private AddressDto address;
    private List<PhoneNumberDto> phoneNumbers = null;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code CustomerDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(CustomerDto instance) {
      Objects.requireNonNull(instance, "instance");
      this.firstName(instance.getFirstName());
      this.lastName(instance.getLastName());
      this.dob(instance.getDob());
      AddressDto addressValue = instance.getAddress();
      if (addressValue != null) {
        address(addressValue);
      }
      List<PhoneNumberDto> phoneNumbersValue = instance.getPhoneNumbers();
      if (phoneNumbersValue != null) {
        addAllPhoneNumbers(phoneNumbersValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link CustomerDto#getFirstName() firstName} attribute.
     * @param firstName The value for firstName 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("firstName")
    public final Builder firstName(String firstName) {
      this.firstName = Objects.requireNonNull(firstName, "firstName");
      initBits &= ~INIT_BIT_FIRST_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link CustomerDto#getLastName() lastName} attribute.
     * @param lastName The value for lastName 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastName")
    public final Builder lastName(String lastName) {
      this.lastName = Objects.requireNonNull(lastName, "lastName");
      initBits &= ~INIT_BIT_LAST_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link CustomerDto#getDob() dob} attribute.
     * @param dob The value for dob 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dob")
    public final Builder dob(String dob) {
      this.dob = Objects.requireNonNull(dob, "dob");
      initBits &= ~INIT_BIT_DOB;
      return this;
    }

    /**
     * Initializes the value for the {@link CustomerDto#getAddress() address} attribute.
     * @param address The value for address (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("address")
    public final Builder address(@Nullable AddressDto address) {
      this.address = address;
      return this;
    }

    /**
     * Adds one element to {@link CustomerDto#getPhoneNumbers() phoneNumbers} list.
     * @param element A phoneNumbers element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPhoneNumbers(PhoneNumberDto element) {
      if (this.phoneNumbers == null) {
        this.phoneNumbers = new ArrayList<PhoneNumberDto>();
      }
      this.phoneNumbers.add(Objects.requireNonNull(element, "phoneNumbers element"));
      return this;
    }

    /**
     * Adds elements to {@link CustomerDto#getPhoneNumbers() phoneNumbers} list.
     * @param elements An array of phoneNumbers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPhoneNumbers(PhoneNumberDto... elements) {
      if (this.phoneNumbers == null) {
        this.phoneNumbers = new ArrayList<PhoneNumberDto>();
      }
      for (PhoneNumberDto element : elements) {
        this.phoneNumbers.add(Objects.requireNonNull(element, "phoneNumbers element"));
      }
      return this;
    }


    /**
     * Sets or replaces all elements for {@link CustomerDto#getPhoneNumbers() phoneNumbers} list.
     * @param elements An iterable of phoneNumbers elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("phoneNumbers")
    public final Builder phoneNumbers(@Nullable Iterable<? extends PhoneNumberDto> elements) {
      if (elements == null) {
        this.phoneNumbers = null;
        return this;
      }
      this.phoneNumbers = new ArrayList<PhoneNumberDto>();
      return addAllPhoneNumbers(elements);
    }

    /**
     * Adds elements to {@link CustomerDto#getPhoneNumbers() phoneNumbers} list.
     * @param elements An iterable of phoneNumbers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllPhoneNumbers(Iterable<? extends PhoneNumberDto> elements) {
      Objects.requireNonNull(elements, "phoneNumbers element");
      if (this.phoneNumbers == null) {
        this.phoneNumbers = new ArrayList<PhoneNumberDto>();
      }
      for (PhoneNumberDto element : elements) {
        this.phoneNumbers.add(Objects.requireNonNull(element, "phoneNumbers element"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableCustomerDto ImmutableCustomerDto}.
     * @return An immutable instance of CustomerDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCustomerDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCustomerDto(
          firstName,
          lastName,
          dob,
          address,
          phoneNumbers == null ? null : createUnmodifiableList(true, phoneNumbers));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_FIRST_NAME) != 0) attributes.add("firstName");
      if ((initBits & INIT_BIT_LAST_NAME) != 0) attributes.add("lastName");
      if ((initBits & INIT_BIT_DOB) != 0) attributes.add("dob");
      return "Cannot build CustomerDto, some of required attributes are not set " + attributes;
    }
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>(size);
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
