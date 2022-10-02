/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.video.STDVulkanVideoCodecH265.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoEncodeH265SliceSegmentLongTermRefPics {
 *     uint8_t num_long_term_sps;
 *     uint8_t num_long_term_pics;
 *     uint8_t lt_idx_sps[STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS];
 *     uint8_t poc_lsb_lt[STD_VIDEO_H265_MAX_LONG_TERM_PICS];
 *     uint16_t used_by_curr_pic_lt_flag;
 *     uint8_t delta_poc_msb_present_flag[STD_VIDEO_H265_MAX_DELTA_POC];
 *     uint8_t delta_poc_msb_cycle_lt[STD_VIDEO_H265_MAX_DELTA_POC];
 * }</code></pre>
 */
public class StdVideoEncodeH265SliceSegmentLongTermRefPics extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NUM_LONG_TERM_SPS,
        NUM_LONG_TERM_PICS,
        LT_IDX_SPS,
        POC_LSB_LT,
        USED_BY_CURR_PIC_LT_FLAG,
        DELTA_POC_MSB_PRESENT_FLAG,
        DELTA_POC_MSB_CYCLE_LT;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1),
            __array(1, STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS),
            __array(1, STD_VIDEO_H265_MAX_LONG_TERM_PICS),
            __member(2),
            __array(1, STD_VIDEO_H265_MAX_DELTA_POC),
            __array(1, STD_VIDEO_H265_MAX_DELTA_POC)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NUM_LONG_TERM_SPS = layout.offsetof(0);
        NUM_LONG_TERM_PICS = layout.offsetof(1);
        LT_IDX_SPS = layout.offsetof(2);
        POC_LSB_LT = layout.offsetof(3);
        USED_BY_CURR_PIC_LT_FLAG = layout.offsetof(4);
        DELTA_POC_MSB_PRESENT_FLAG = layout.offsetof(5);
        DELTA_POC_MSB_CYCLE_LT = layout.offsetof(6);
    }

    /**
     * Creates a {@code StdVideoEncodeH265SliceSegmentLongTermRefPics} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeH265SliceSegmentLongTermRefPics(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code num_long_term_sps} field. */
    @NativeType("uint8_t")
    public byte num_long_term_sps() { return nnum_long_term_sps(address()); }
    /** @return the value of the {@code num_long_term_pics} field. */
    @NativeType("uint8_t")
    public byte num_long_term_pics() { return nnum_long_term_pics(address()); }
    /** @return a {@link ByteBuffer} view of the {@code lt_idx_sps} field. */
    @NativeType("uint8_t[STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS]")
    public ByteBuffer lt_idx_sps() { return nlt_idx_sps(address()); }
    /** @return the value at the specified index of the {@code lt_idx_sps} field. */
    @NativeType("uint8_t")
    public byte lt_idx_sps(int index) { return nlt_idx_sps(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code poc_lsb_lt} field. */
    @NativeType("uint8_t[STD_VIDEO_H265_MAX_LONG_TERM_PICS]")
    public ByteBuffer poc_lsb_lt() { return npoc_lsb_lt(address()); }
    /** @return the value at the specified index of the {@code poc_lsb_lt} field. */
    @NativeType("uint8_t")
    public byte poc_lsb_lt(int index) { return npoc_lsb_lt(address(), index); }
    /** @return the value of the {@code used_by_curr_pic_lt_flag} field. */
    @NativeType("uint16_t")
    public short used_by_curr_pic_lt_flag() { return nused_by_curr_pic_lt_flag(address()); }
    /** @return a {@link ByteBuffer} view of the {@code delta_poc_msb_present_flag} field. */
    @NativeType("uint8_t[STD_VIDEO_H265_MAX_DELTA_POC]")
    public ByteBuffer delta_poc_msb_present_flag() { return ndelta_poc_msb_present_flag(address()); }
    /** @return the value at the specified index of the {@code delta_poc_msb_present_flag} field. */
    @NativeType("uint8_t")
    public byte delta_poc_msb_present_flag(int index) { return ndelta_poc_msb_present_flag(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code delta_poc_msb_cycle_lt} field. */
    @NativeType("uint8_t[STD_VIDEO_H265_MAX_DELTA_POC]")
    public ByteBuffer delta_poc_msb_cycle_lt() { return ndelta_poc_msb_cycle_lt(address()); }
    /** @return the value at the specified index of the {@code delta_poc_msb_cycle_lt} field. */
    @NativeType("uint8_t")
    public byte delta_poc_msb_cycle_lt(int index) { return ndelta_poc_msb_cycle_lt(address(), index); }

    /** Sets the specified value to the {@code num_long_term_sps} field. */
    public StdVideoEncodeH265SliceSegmentLongTermRefPics num_long_term_sps(@NativeType("uint8_t") byte value) { nnum_long_term_sps(address(), value); return this; }
    /** Sets the specified value to the {@code num_long_term_pics} field. */
    public StdVideoEncodeH265SliceSegmentLongTermRefPics num_long_term_pics(@NativeType("uint8_t") byte value) { nnum_long_term_pics(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code lt_idx_sps} field. */
    public StdVideoEncodeH265SliceSegmentLongTermRefPics lt_idx_sps(@NativeType("uint8_t[STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS]") ByteBuffer value) { nlt_idx_sps(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code lt_idx_sps} field. */
    public StdVideoEncodeH265SliceSegmentLongTermRefPics lt_idx_sps(int index, @NativeType("uint8_t") byte value) { nlt_idx_sps(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code poc_lsb_lt} field. */
    public StdVideoEncodeH265SliceSegmentLongTermRefPics poc_lsb_lt(@NativeType("uint8_t[STD_VIDEO_H265_MAX_LONG_TERM_PICS]") ByteBuffer value) { npoc_lsb_lt(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code poc_lsb_lt} field. */
    public StdVideoEncodeH265SliceSegmentLongTermRefPics poc_lsb_lt(int index, @NativeType("uint8_t") byte value) { npoc_lsb_lt(address(), index, value); return this; }
    /** Sets the specified value to the {@code used_by_curr_pic_lt_flag} field. */
    public StdVideoEncodeH265SliceSegmentLongTermRefPics used_by_curr_pic_lt_flag(@NativeType("uint16_t") short value) { nused_by_curr_pic_lt_flag(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code delta_poc_msb_present_flag} field. */
    public StdVideoEncodeH265SliceSegmentLongTermRefPics delta_poc_msb_present_flag(@NativeType("uint8_t[STD_VIDEO_H265_MAX_DELTA_POC]") ByteBuffer value) { ndelta_poc_msb_present_flag(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code delta_poc_msb_present_flag} field. */
    public StdVideoEncodeH265SliceSegmentLongTermRefPics delta_poc_msb_present_flag(int index, @NativeType("uint8_t") byte value) { ndelta_poc_msb_present_flag(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code delta_poc_msb_cycle_lt} field. */
    public StdVideoEncodeH265SliceSegmentLongTermRefPics delta_poc_msb_cycle_lt(@NativeType("uint8_t[STD_VIDEO_H265_MAX_DELTA_POC]") ByteBuffer value) { ndelta_poc_msb_cycle_lt(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code delta_poc_msb_cycle_lt} field. */
    public StdVideoEncodeH265SliceSegmentLongTermRefPics delta_poc_msb_cycle_lt(int index, @NativeType("uint8_t") byte value) { ndelta_poc_msb_cycle_lt(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH265SliceSegmentLongTermRefPics set(
        byte num_long_term_sps,
        byte num_long_term_pics,
        ByteBuffer lt_idx_sps,
        ByteBuffer poc_lsb_lt,
        short used_by_curr_pic_lt_flag,
        ByteBuffer delta_poc_msb_present_flag,
        ByteBuffer delta_poc_msb_cycle_lt
    ) {
        num_long_term_sps(num_long_term_sps);
        num_long_term_pics(num_long_term_pics);
        lt_idx_sps(lt_idx_sps);
        poc_lsb_lt(poc_lsb_lt);
        used_by_curr_pic_lt_flag(used_by_curr_pic_lt_flag);
        delta_poc_msb_present_flag(delta_poc_msb_present_flag);
        delta_poc_msb_cycle_lt(delta_poc_msb_cycle_lt);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeH265SliceSegmentLongTermRefPics set(StdVideoEncodeH265SliceSegmentLongTermRefPics src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeH265SliceSegmentLongTermRefPics} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265SliceSegmentLongTermRefPics malloc() {
        return wrap(StdVideoEncodeH265SliceSegmentLongTermRefPics.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoEncodeH265SliceSegmentLongTermRefPics} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265SliceSegmentLongTermRefPics calloc() {
        return wrap(StdVideoEncodeH265SliceSegmentLongTermRefPics.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoEncodeH265SliceSegmentLongTermRefPics} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH265SliceSegmentLongTermRefPics create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoEncodeH265SliceSegmentLongTermRefPics.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH265SliceSegmentLongTermRefPics} instance for the specified memory address. */
    public static StdVideoEncodeH265SliceSegmentLongTermRefPics create(long address) {
        return wrap(StdVideoEncodeH265SliceSegmentLongTermRefPics.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265SliceSegmentLongTermRefPics createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoEncodeH265SliceSegmentLongTermRefPics.class, address);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265SliceSegmentLongTermRefPics.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265SliceSegmentLongTermRefPics.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265SliceSegmentLongTermRefPics.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265SliceSegmentLongTermRefPics.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265SliceSegmentLongTermRefPics.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265SliceSegmentLongTermRefPics.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoEncodeH265SliceSegmentLongTermRefPics.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265SliceSegmentLongTermRefPics.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265SliceSegmentLongTermRefPics.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH265SliceSegmentLongTermRefPics} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265SliceSegmentLongTermRefPics malloc(MemoryStack stack) {
        return wrap(StdVideoEncodeH265SliceSegmentLongTermRefPics.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoEncodeH265SliceSegmentLongTermRefPics} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265SliceSegmentLongTermRefPics calloc(MemoryStack stack) {
        return wrap(StdVideoEncodeH265SliceSegmentLongTermRefPics.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoEncodeH265SliceSegmentLongTermRefPics.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265SliceSegmentLongTermRefPics.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265SliceSegmentLongTermRefPics.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265SliceSegmentLongTermRefPics.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #num_long_term_sps}. */
    public static byte nnum_long_term_sps(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceSegmentLongTermRefPics.NUM_LONG_TERM_SPS); }
    /** Unsafe version of {@link #num_long_term_pics}. */
    public static byte nnum_long_term_pics(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceSegmentLongTermRefPics.NUM_LONG_TERM_PICS); }
    /** Unsafe version of {@link #lt_idx_sps}. */
    public static ByteBuffer nlt_idx_sps(long struct) { return memByteBuffer(struct + StdVideoEncodeH265SliceSegmentLongTermRefPics.LT_IDX_SPS, STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS); }
    /** Unsafe version of {@link #lt_idx_sps(int) lt_idx_sps}. */
    public static byte nlt_idx_sps(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceSegmentLongTermRefPics.LT_IDX_SPS + check(index, STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS) * 1);
    }
    /** Unsafe version of {@link #poc_lsb_lt}. */
    public static ByteBuffer npoc_lsb_lt(long struct) { return memByteBuffer(struct + StdVideoEncodeH265SliceSegmentLongTermRefPics.POC_LSB_LT, STD_VIDEO_H265_MAX_LONG_TERM_PICS); }
    /** Unsafe version of {@link #poc_lsb_lt(int) poc_lsb_lt}. */
    public static byte npoc_lsb_lt(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceSegmentLongTermRefPics.POC_LSB_LT + check(index, STD_VIDEO_H265_MAX_LONG_TERM_PICS) * 1);
    }
    /** Unsafe version of {@link #used_by_curr_pic_lt_flag}. */
    public static short nused_by_curr_pic_lt_flag(long struct) { return UNSAFE.getShort(null, struct + StdVideoEncodeH265SliceSegmentLongTermRefPics.USED_BY_CURR_PIC_LT_FLAG); }
    /** Unsafe version of {@link #delta_poc_msb_present_flag}. */
    public static ByteBuffer ndelta_poc_msb_present_flag(long struct) { return memByteBuffer(struct + StdVideoEncodeH265SliceSegmentLongTermRefPics.DELTA_POC_MSB_PRESENT_FLAG, STD_VIDEO_H265_MAX_DELTA_POC); }
    /** Unsafe version of {@link #delta_poc_msb_present_flag(int) delta_poc_msb_present_flag}. */
    public static byte ndelta_poc_msb_present_flag(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceSegmentLongTermRefPics.DELTA_POC_MSB_PRESENT_FLAG + check(index, STD_VIDEO_H265_MAX_DELTA_POC) * 1);
    }
    /** Unsafe version of {@link #delta_poc_msb_cycle_lt}. */
    public static ByteBuffer ndelta_poc_msb_cycle_lt(long struct) { return memByteBuffer(struct + StdVideoEncodeH265SliceSegmentLongTermRefPics.DELTA_POC_MSB_CYCLE_LT, STD_VIDEO_H265_MAX_DELTA_POC); }
    /** Unsafe version of {@link #delta_poc_msb_cycle_lt(int) delta_poc_msb_cycle_lt}. */
    public static byte ndelta_poc_msb_cycle_lt(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceSegmentLongTermRefPics.DELTA_POC_MSB_CYCLE_LT + check(index, STD_VIDEO_H265_MAX_DELTA_POC) * 1);
    }

    /** Unsafe version of {@link #num_long_term_sps(byte) num_long_term_sps}. */
    public static void nnum_long_term_sps(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceSegmentLongTermRefPics.NUM_LONG_TERM_SPS, value); }
    /** Unsafe version of {@link #num_long_term_pics(byte) num_long_term_pics}. */
    public static void nnum_long_term_pics(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceSegmentLongTermRefPics.NUM_LONG_TERM_PICS, value); }
    /** Unsafe version of {@link #lt_idx_sps(ByteBuffer) lt_idx_sps}. */
    public static void nlt_idx_sps(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS); }
        memCopy(memAddress(value), struct + StdVideoEncodeH265SliceSegmentLongTermRefPics.LT_IDX_SPS, value.remaining() * 1);
    }
    /** Unsafe version of {@link #lt_idx_sps(int, byte) lt_idx_sps}. */
    public static void nlt_idx_sps(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceSegmentLongTermRefPics.LT_IDX_SPS + check(index, STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS) * 1, value);
    }
    /** Unsafe version of {@link #poc_lsb_lt(ByteBuffer) poc_lsb_lt}. */
    public static void npoc_lsb_lt(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_MAX_LONG_TERM_PICS); }
        memCopy(memAddress(value), struct + StdVideoEncodeH265SliceSegmentLongTermRefPics.POC_LSB_LT, value.remaining() * 1);
    }
    /** Unsafe version of {@link #poc_lsb_lt(int, byte) poc_lsb_lt}. */
    public static void npoc_lsb_lt(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceSegmentLongTermRefPics.POC_LSB_LT + check(index, STD_VIDEO_H265_MAX_LONG_TERM_PICS) * 1, value);
    }
    /** Unsafe version of {@link #used_by_curr_pic_lt_flag(short) used_by_curr_pic_lt_flag}. */
    public static void nused_by_curr_pic_lt_flag(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoEncodeH265SliceSegmentLongTermRefPics.USED_BY_CURR_PIC_LT_FLAG, value); }
    /** Unsafe version of {@link #delta_poc_msb_present_flag(ByteBuffer) delta_poc_msb_present_flag}. */
    public static void ndelta_poc_msb_present_flag(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_MAX_DELTA_POC); }
        memCopy(memAddress(value), struct + StdVideoEncodeH265SliceSegmentLongTermRefPics.DELTA_POC_MSB_PRESENT_FLAG, value.remaining() * 1);
    }
    /** Unsafe version of {@link #delta_poc_msb_present_flag(int, byte) delta_poc_msb_present_flag}. */
    public static void ndelta_poc_msb_present_flag(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceSegmentLongTermRefPics.DELTA_POC_MSB_PRESENT_FLAG + check(index, STD_VIDEO_H265_MAX_DELTA_POC) * 1, value);
    }
    /** Unsafe version of {@link #delta_poc_msb_cycle_lt(ByteBuffer) delta_poc_msb_cycle_lt}. */
    public static void ndelta_poc_msb_cycle_lt(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_MAX_DELTA_POC); }
        memCopy(memAddress(value), struct + StdVideoEncodeH265SliceSegmentLongTermRefPics.DELTA_POC_MSB_CYCLE_LT, value.remaining() * 1);
    }
    /** Unsafe version of {@link #delta_poc_msb_cycle_lt(int, byte) delta_poc_msb_cycle_lt}. */
    public static void ndelta_poc_msb_cycle_lt(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceSegmentLongTermRefPics.DELTA_POC_MSB_CYCLE_LT + check(index, STD_VIDEO_H265_MAX_DELTA_POC) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH265SliceSegmentLongTermRefPics} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH265SliceSegmentLongTermRefPics, Buffer> implements NativeResource {

        private static final StdVideoEncodeH265SliceSegmentLongTermRefPics ELEMENT_FACTORY = StdVideoEncodeH265SliceSegmentLongTermRefPics.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH265SliceSegmentLongTermRefPics.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH265SliceSegmentLongTermRefPics#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoEncodeH265SliceSegmentLongTermRefPics getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code num_long_term_sps} field. */
        @NativeType("uint8_t")
        public byte num_long_term_sps() { return StdVideoEncodeH265SliceSegmentLongTermRefPics.nnum_long_term_sps(address()); }
        /** @return the value of the {@code num_long_term_pics} field. */
        @NativeType("uint8_t")
        public byte num_long_term_pics() { return StdVideoEncodeH265SliceSegmentLongTermRefPics.nnum_long_term_pics(address()); }
        /** @return a {@link ByteBuffer} view of the {@code lt_idx_sps} field. */
        @NativeType("uint8_t[STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS]")
        public ByteBuffer lt_idx_sps() { return StdVideoEncodeH265SliceSegmentLongTermRefPics.nlt_idx_sps(address()); }
        /** @return the value at the specified index of the {@code lt_idx_sps} field. */
        @NativeType("uint8_t")
        public byte lt_idx_sps(int index) { return StdVideoEncodeH265SliceSegmentLongTermRefPics.nlt_idx_sps(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code poc_lsb_lt} field. */
        @NativeType("uint8_t[STD_VIDEO_H265_MAX_LONG_TERM_PICS]")
        public ByteBuffer poc_lsb_lt() { return StdVideoEncodeH265SliceSegmentLongTermRefPics.npoc_lsb_lt(address()); }
        /** @return the value at the specified index of the {@code poc_lsb_lt} field. */
        @NativeType("uint8_t")
        public byte poc_lsb_lt(int index) { return StdVideoEncodeH265SliceSegmentLongTermRefPics.npoc_lsb_lt(address(), index); }
        /** @return the value of the {@code used_by_curr_pic_lt_flag} field. */
        @NativeType("uint16_t")
        public short used_by_curr_pic_lt_flag() { return StdVideoEncodeH265SliceSegmentLongTermRefPics.nused_by_curr_pic_lt_flag(address()); }
        /** @return a {@link ByteBuffer} view of the {@code delta_poc_msb_present_flag} field. */
        @NativeType("uint8_t[STD_VIDEO_H265_MAX_DELTA_POC]")
        public ByteBuffer delta_poc_msb_present_flag() { return StdVideoEncodeH265SliceSegmentLongTermRefPics.ndelta_poc_msb_present_flag(address()); }
        /** @return the value at the specified index of the {@code delta_poc_msb_present_flag} field. */
        @NativeType("uint8_t")
        public byte delta_poc_msb_present_flag(int index) { return StdVideoEncodeH265SliceSegmentLongTermRefPics.ndelta_poc_msb_present_flag(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code delta_poc_msb_cycle_lt} field. */
        @NativeType("uint8_t[STD_VIDEO_H265_MAX_DELTA_POC]")
        public ByteBuffer delta_poc_msb_cycle_lt() { return StdVideoEncodeH265SliceSegmentLongTermRefPics.ndelta_poc_msb_cycle_lt(address()); }
        /** @return the value at the specified index of the {@code delta_poc_msb_cycle_lt} field. */
        @NativeType("uint8_t")
        public byte delta_poc_msb_cycle_lt(int index) { return StdVideoEncodeH265SliceSegmentLongTermRefPics.ndelta_poc_msb_cycle_lt(address(), index); }

        /** Sets the specified value to the {@code num_long_term_sps} field. */
        public StdVideoEncodeH265SliceSegmentLongTermRefPics.Buffer num_long_term_sps(@NativeType("uint8_t") byte value) { StdVideoEncodeH265SliceSegmentLongTermRefPics.nnum_long_term_sps(address(), value); return this; }
        /** Sets the specified value to the {@code num_long_term_pics} field. */
        public StdVideoEncodeH265SliceSegmentLongTermRefPics.Buffer num_long_term_pics(@NativeType("uint8_t") byte value) { StdVideoEncodeH265SliceSegmentLongTermRefPics.nnum_long_term_pics(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code lt_idx_sps} field. */
        public StdVideoEncodeH265SliceSegmentLongTermRefPics.Buffer lt_idx_sps(@NativeType("uint8_t[STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS]") ByteBuffer value) { StdVideoEncodeH265SliceSegmentLongTermRefPics.nlt_idx_sps(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code lt_idx_sps} field. */
        public StdVideoEncodeH265SliceSegmentLongTermRefPics.Buffer lt_idx_sps(int index, @NativeType("uint8_t") byte value) { StdVideoEncodeH265SliceSegmentLongTermRefPics.nlt_idx_sps(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code poc_lsb_lt} field. */
        public StdVideoEncodeH265SliceSegmentLongTermRefPics.Buffer poc_lsb_lt(@NativeType("uint8_t[STD_VIDEO_H265_MAX_LONG_TERM_PICS]") ByteBuffer value) { StdVideoEncodeH265SliceSegmentLongTermRefPics.npoc_lsb_lt(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code poc_lsb_lt} field. */
        public StdVideoEncodeH265SliceSegmentLongTermRefPics.Buffer poc_lsb_lt(int index, @NativeType("uint8_t") byte value) { StdVideoEncodeH265SliceSegmentLongTermRefPics.npoc_lsb_lt(address(), index, value); return this; }
        /** Sets the specified value to the {@code used_by_curr_pic_lt_flag} field. */
        public StdVideoEncodeH265SliceSegmentLongTermRefPics.Buffer used_by_curr_pic_lt_flag(@NativeType("uint16_t") short value) { StdVideoEncodeH265SliceSegmentLongTermRefPics.nused_by_curr_pic_lt_flag(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code delta_poc_msb_present_flag} field. */
        public StdVideoEncodeH265SliceSegmentLongTermRefPics.Buffer delta_poc_msb_present_flag(@NativeType("uint8_t[STD_VIDEO_H265_MAX_DELTA_POC]") ByteBuffer value) { StdVideoEncodeH265SliceSegmentLongTermRefPics.ndelta_poc_msb_present_flag(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code delta_poc_msb_present_flag} field. */
        public StdVideoEncodeH265SliceSegmentLongTermRefPics.Buffer delta_poc_msb_present_flag(int index, @NativeType("uint8_t") byte value) { StdVideoEncodeH265SliceSegmentLongTermRefPics.ndelta_poc_msb_present_flag(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code delta_poc_msb_cycle_lt} field. */
        public StdVideoEncodeH265SliceSegmentLongTermRefPics.Buffer delta_poc_msb_cycle_lt(@NativeType("uint8_t[STD_VIDEO_H265_MAX_DELTA_POC]") ByteBuffer value) { StdVideoEncodeH265SliceSegmentLongTermRefPics.ndelta_poc_msb_cycle_lt(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code delta_poc_msb_cycle_lt} field. */
        public StdVideoEncodeH265SliceSegmentLongTermRefPics.Buffer delta_poc_msb_cycle_lt(int index, @NativeType("uint8_t") byte value) { StdVideoEncodeH265SliceSegmentLongTermRefPics.ndelta_poc_msb_cycle_lt(address(), index, value); return this; }

    }

}