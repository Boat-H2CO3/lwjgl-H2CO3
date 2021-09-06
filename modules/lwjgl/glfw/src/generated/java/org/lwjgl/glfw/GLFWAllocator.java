/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A custom memory allocator that can be set with {@link GLFW#glfwInitAllocator InitAllocator}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct GLFWallocator {
 *     {@link GLFWAllocateCallbackI GLFWallocatefun} {@link #allocate};
 *     {@link GLFWReallocateCallbackI GLFWreallocatefun} {@link #reallocate};
 *     {@link GLFWDeallocateCallbackI GLFWdeallocatefun} {@link #deallocate};
 *     void * {@link #user};
 * }</code></pre>
 *
 * @since version 3.4
 */
@NativeType("struct GLFWallocator")
public class GLFWAllocator extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ALLOCATE,
        REALLOCATE,
        DEALLOCATE,
        USER;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ALLOCATE = layout.offsetof(0);
        REALLOCATE = layout.offsetof(1);
        DEALLOCATE = layout.offsetof(2);
        USER = layout.offsetof(3);
    }

    /**
     * Creates a {@code GLFWAllocator} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public GLFWAllocator(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the memory allocation callback */
    @NativeType("GLFWallocatefun")
    public GLFWAllocateCallback allocate() { return nallocate(address()); }
    /** the memory reallocation callback */
    @NativeType("GLFWreallocatefun")
    public GLFWReallocateCallback reallocate() { return nreallocate(address()); }
    /** the memory deallocation callback */
    @NativeType("GLFWdeallocatefun")
    public GLFWDeallocateCallback deallocate() { return ndeallocate(address()); }
    /** a user-defined pointer that will be passed to the callbacks */
    @NativeType("void *")
    public long user() { return nuser(address()); }

    /** Sets the specified value to the {@link #allocate} field. */
    public GLFWAllocator allocate(@NativeType("GLFWallocatefun") GLFWAllocateCallbackI value) { nallocate(address(), value); return this; }
    /** Sets the specified value to the {@link #reallocate} field. */
    public GLFWAllocator reallocate(@NativeType("GLFWreallocatefun") GLFWReallocateCallbackI value) { nreallocate(address(), value); return this; }
    /** Sets the specified value to the {@link #deallocate} field. */
    public GLFWAllocator deallocate(@NativeType("GLFWdeallocatefun") GLFWDeallocateCallbackI value) { ndeallocate(address(), value); return this; }
    /** Sets the specified value to the {@link #user} field. */
    public GLFWAllocator user(@NativeType("void *") long value) { nuser(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public GLFWAllocator set(
        GLFWAllocateCallbackI allocate,
        GLFWReallocateCallbackI reallocate,
        GLFWDeallocateCallbackI deallocate,
        long user
    ) {
        allocate(allocate);
        reallocate(reallocate);
        deallocate(deallocate);
        user(user);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public GLFWAllocator set(GLFWAllocator src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code GLFWAllocator} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static GLFWAllocator malloc() {
        return wrap(GLFWAllocator.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code GLFWAllocator} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static GLFWAllocator calloc() {
        return wrap(GLFWAllocator.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code GLFWAllocator} instance allocated with {@link BufferUtils}. */
    public static GLFWAllocator create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(GLFWAllocator.class, memAddress(container), container);
    }

    /** Returns a new {@code GLFWAllocator} instance for the specified memory address. */
    public static GLFWAllocator create(long address) {
        return wrap(GLFWAllocator.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static GLFWAllocator createSafe(long address) {
        return address == NULL ? null : wrap(GLFWAllocator.class, address);
    }

    /**
     * Returns a new {@link GLFWAllocator.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static GLFWAllocator.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link GLFWAllocator.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static GLFWAllocator.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link GLFWAllocator.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static GLFWAllocator.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link GLFWAllocator.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static GLFWAllocator.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static GLFWAllocator.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }


    /**
     * Returns a new {@code GLFWAllocator} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static GLFWAllocator malloc(MemoryStack stack) {
        return wrap(GLFWAllocator.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code GLFWAllocator} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static GLFWAllocator calloc(MemoryStack stack) {
        return wrap(GLFWAllocator.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link GLFWAllocator.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static GLFWAllocator.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link GLFWAllocator.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static GLFWAllocator.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #allocate}. */
    public static GLFWAllocateCallback nallocate(long struct) { return GLFWAllocateCallback.create(memGetAddress(struct + GLFWAllocator.ALLOCATE)); }
    /** Unsafe version of {@link #reallocate}. */
    public static GLFWReallocateCallback nreallocate(long struct) { return GLFWReallocateCallback.create(memGetAddress(struct + GLFWAllocator.REALLOCATE)); }
    /** Unsafe version of {@link #deallocate}. */
    public static GLFWDeallocateCallback ndeallocate(long struct) { return GLFWDeallocateCallback.create(memGetAddress(struct + GLFWAllocator.DEALLOCATE)); }
    /** Unsafe version of {@link #user}. */
    public static long nuser(long struct) { return memGetAddress(struct + GLFWAllocator.USER); }

    /** Unsafe version of {@link #allocate(GLFWAllocateCallbackI) allocate}. */
    public static void nallocate(long struct, GLFWAllocateCallbackI value) { memPutAddress(struct + GLFWAllocator.ALLOCATE, value.address()); }
    /** Unsafe version of {@link #reallocate(GLFWReallocateCallbackI) reallocate}. */
    public static void nreallocate(long struct, GLFWReallocateCallbackI value) { memPutAddress(struct + GLFWAllocator.REALLOCATE, value.address()); }
    /** Unsafe version of {@link #deallocate(GLFWDeallocateCallbackI) deallocate}. */
    public static void ndeallocate(long struct, GLFWDeallocateCallbackI value) { memPutAddress(struct + GLFWAllocator.DEALLOCATE, value.address()); }
    /** Unsafe version of {@link #user(long) user}. */
    public static void nuser(long struct, long value) { memPutAddress(struct + GLFWAllocator.USER, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + GLFWAllocator.ALLOCATE));
        check(memGetAddress(struct + GLFWAllocator.REALLOCATE));
        check(memGetAddress(struct + GLFWAllocator.DEALLOCATE));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link GLFWAllocator} structs. */
    public static class Buffer extends StructBuffer<GLFWAllocator, Buffer> implements NativeResource {

        private static final GLFWAllocator ELEMENT_FACTORY = GLFWAllocator.create(-1L);

        /**
         * Creates a new {@code GLFWAllocator.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link GLFWAllocator#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected GLFWAllocator getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link GLFWAllocator#allocate} field. */
        @NativeType("GLFWallocatefun")
        public GLFWAllocateCallback allocate() { return GLFWAllocator.nallocate(address()); }
        /** @return the value of the {@link GLFWAllocator#reallocate} field. */
        @NativeType("GLFWreallocatefun")
        public GLFWReallocateCallback reallocate() { return GLFWAllocator.nreallocate(address()); }
        /** @return the value of the {@link GLFWAllocator#deallocate} field. */
        @NativeType("GLFWdeallocatefun")
        public GLFWDeallocateCallback deallocate() { return GLFWAllocator.ndeallocate(address()); }
        /** @return the value of the {@link GLFWAllocator#user} field. */
        @NativeType("void *")
        public long user() { return GLFWAllocator.nuser(address()); }

        /** Sets the specified value to the {@link GLFWAllocator#allocate} field. */
        public GLFWAllocator.Buffer allocate(@NativeType("GLFWallocatefun") GLFWAllocateCallbackI value) { GLFWAllocator.nallocate(address(), value); return this; }
        /** Sets the specified value to the {@link GLFWAllocator#reallocate} field. */
        public GLFWAllocator.Buffer reallocate(@NativeType("GLFWreallocatefun") GLFWReallocateCallbackI value) { GLFWAllocator.nreallocate(address(), value); return this; }
        /** Sets the specified value to the {@link GLFWAllocator#deallocate} field. */
        public GLFWAllocator.Buffer deallocate(@NativeType("GLFWdeallocatefun") GLFWDeallocateCallbackI value) { GLFWAllocator.ndeallocate(address(), value); return this; }
        /** Sets the specified value to the {@link GLFWAllocator#user} field. */
        public GLFWAllocator.Buffer user(@NativeType("void *") long value) { GLFWAllocator.nuser(address(), value); return this; }

    }

}