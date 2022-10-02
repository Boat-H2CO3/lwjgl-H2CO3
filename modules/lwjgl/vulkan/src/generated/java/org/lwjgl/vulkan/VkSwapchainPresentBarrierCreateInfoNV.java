/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * specify the present barrier membership of this swapchain.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@code pNext} chain of {@link VkSwapchainCreateInfoKHR} does not include this structure, the default value for {@code presentBarrierEnable} is {@link VK10#VK_FALSE FALSE}, meaning the swapchain does not request to use the present barrier. Additionally, when recreating a swapchain that was using the present barrier, and the {@code pNext} chain of {@link VkSwapchainCreateInfoKHR} does not include this structure, it means the swapchain will stop using the present barrier.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVPresentBarrier#VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_BARRIER_CREATE_INFO_NV STRUCTURE_TYPE_SWAPCHAIN_PRESENT_BARRIER_CREATE_INFO_NV}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSwapchainPresentBarrierCreateInfoNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #presentBarrierEnable};
 * }</code></pre>
 */
public class VkSwapchainPresentBarrierCreateInfoNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRESENTBARRIERENABLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESENTBARRIERENABLE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkSwapchainPresentBarrierCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSwapchainPresentBarrierCreateInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a boolean value indicating a request for using the <em>present barrier</em>. */
    @NativeType("VkBool32")
    public boolean presentBarrierEnable() { return npresentBarrierEnable(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSwapchainPresentBarrierCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVPresentBarrier#VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_BARRIER_CREATE_INFO_NV STRUCTURE_TYPE_SWAPCHAIN_PRESENT_BARRIER_CREATE_INFO_NV} value to the {@link #sType} field. */
    public VkSwapchainPresentBarrierCreateInfoNV sType$Default() { return sType(NVPresentBarrier.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_BARRIER_CREATE_INFO_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSwapchainPresentBarrierCreateInfoNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #presentBarrierEnable} field. */
    public VkSwapchainPresentBarrierCreateInfoNV presentBarrierEnable(@NativeType("VkBool32") boolean value) { npresentBarrierEnable(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkSwapchainPresentBarrierCreateInfoNV set(
        int sType,
        long pNext,
        boolean presentBarrierEnable
    ) {
        sType(sType);
        pNext(pNext);
        presentBarrierEnable(presentBarrierEnable);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSwapchainPresentBarrierCreateInfoNV set(VkSwapchainPresentBarrierCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSwapchainPresentBarrierCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSwapchainPresentBarrierCreateInfoNV malloc() {
        return wrap(VkSwapchainPresentBarrierCreateInfoNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSwapchainPresentBarrierCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSwapchainPresentBarrierCreateInfoNV calloc() {
        return wrap(VkSwapchainPresentBarrierCreateInfoNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSwapchainPresentBarrierCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkSwapchainPresentBarrierCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSwapchainPresentBarrierCreateInfoNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSwapchainPresentBarrierCreateInfoNV} instance for the specified memory address. */
    public static VkSwapchainPresentBarrierCreateInfoNV create(long address) {
        return wrap(VkSwapchainPresentBarrierCreateInfoNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSwapchainPresentBarrierCreateInfoNV createSafe(long address) {
        return address == NULL ? null : wrap(VkSwapchainPresentBarrierCreateInfoNV.class, address);
    }

    /**
     * Returns a new {@link VkSwapchainPresentBarrierCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentBarrierCreateInfoNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainPresentBarrierCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentBarrierCreateInfoNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainPresentBarrierCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentBarrierCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSwapchainPresentBarrierCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentBarrierCreateInfoNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSwapchainPresentBarrierCreateInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkSwapchainPresentBarrierCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainPresentBarrierCreateInfoNV malloc(MemoryStack stack) {
        return wrap(VkSwapchainPresentBarrierCreateInfoNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSwapchainPresentBarrierCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainPresentBarrierCreateInfoNV calloc(MemoryStack stack) {
        return wrap(VkSwapchainPresentBarrierCreateInfoNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSwapchainPresentBarrierCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentBarrierCreateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainPresentBarrierCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentBarrierCreateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSwapchainPresentBarrierCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSwapchainPresentBarrierCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #presentBarrierEnable}. */
    public static int npresentBarrierEnable(long struct) { return UNSAFE.getInt(null, struct + VkSwapchainPresentBarrierCreateInfoNV.PRESENTBARRIERENABLE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSwapchainPresentBarrierCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSwapchainPresentBarrierCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #presentBarrierEnable(boolean) presentBarrierEnable}. */
    public static void npresentBarrierEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkSwapchainPresentBarrierCreateInfoNV.PRESENTBARRIERENABLE, value); }

    // -----------------------------------

    /** An array of {@link VkSwapchainPresentBarrierCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkSwapchainPresentBarrierCreateInfoNV, Buffer> implements NativeResource {

        private static final VkSwapchainPresentBarrierCreateInfoNV ELEMENT_FACTORY = VkSwapchainPresentBarrierCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkSwapchainPresentBarrierCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSwapchainPresentBarrierCreateInfoNV#SIZEOF}, and its mark will be undefined.
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
        protected VkSwapchainPresentBarrierCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSwapchainPresentBarrierCreateInfoNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSwapchainPresentBarrierCreateInfoNV.nsType(address()); }
        /** @return the value of the {@link VkSwapchainPresentBarrierCreateInfoNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSwapchainPresentBarrierCreateInfoNV.npNext(address()); }
        /** @return the value of the {@link VkSwapchainPresentBarrierCreateInfoNV#presentBarrierEnable} field. */
        @NativeType("VkBool32")
        public boolean presentBarrierEnable() { return VkSwapchainPresentBarrierCreateInfoNV.npresentBarrierEnable(address()) != 0; }

        /** Sets the specified value to the {@link VkSwapchainPresentBarrierCreateInfoNV#sType} field. */
        public VkSwapchainPresentBarrierCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkSwapchainPresentBarrierCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVPresentBarrier#VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_BARRIER_CREATE_INFO_NV STRUCTURE_TYPE_SWAPCHAIN_PRESENT_BARRIER_CREATE_INFO_NV} value to the {@link VkSwapchainPresentBarrierCreateInfoNV#sType} field. */
        public VkSwapchainPresentBarrierCreateInfoNV.Buffer sType$Default() { return sType(NVPresentBarrier.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_BARRIER_CREATE_INFO_NV); }
        /** Sets the specified value to the {@link VkSwapchainPresentBarrierCreateInfoNV#pNext} field. */
        public VkSwapchainPresentBarrierCreateInfoNV.Buffer pNext(@NativeType("void *") long value) { VkSwapchainPresentBarrierCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkSwapchainPresentBarrierCreateInfoNV#presentBarrierEnable} field. */
        public VkSwapchainPresentBarrierCreateInfoNV.Buffer presentBarrierEnable(@NativeType("VkBool32") boolean value) { VkSwapchainPresentBarrierCreateInfoNV.npresentBarrierEnable(address(), value ? 1 : 0); return this; }

    }

}