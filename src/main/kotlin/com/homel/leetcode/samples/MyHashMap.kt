package com.example.leetcode


private const val INITIAL_CAPACITY = 16


class MyHashMap() {

    /** Initialize your data structure here. */
    private val array: Array<Entry<Int, Int>?> = arrayOfNulls(INITIAL_CAPACITY)
    private var size = 0

    /** value will always be non-negative. */
    fun put(key: Int, value: Int) {
        val entry = Entry(key, value)
        val bucket: Int = key.hashCode() % array.size
        var existing = array[bucket]
        if (existing == null) {
            array[bucket] = entry
            size++
        } else {
            // compare the keys see if key already exists
            while (existing?.next != null) {
                if (existing.key == key) {
                    existing.value = value
                    return
                }
                existing = existing.next
            }
            if (existing?.key == key) {
                existing.value = value
            } else {
                existing?.next = entry
                size++
            }
        }
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    fun get(key: Int): Int {
        var entry = array[key.hashCode() % array.size]

        while (entry != null) {
            if (entry.key == key) return entry.value
            entry = entry.next
        }
        return -1
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    fun remove(key: Int) {
        val index: Int = key.hashCode() % array.size
        if (array[index] == null) return

        var prev = find(array[index], key)

        if (prev?.next == null) return

        prev.next = prev.next?.next

       /* var prevEntry = array[index]
        var currentEntry = prevEntry
        var nextEntry = currentEntry?.next

        if (nextEntry == null && currentEntry?.key == key) {
            array[index] = null
            size--
        }

        if (nextEntry != null && currentEntry?.key == key) {
            array[index] = nextEntry
            size--
        } else if (nextEntry != null && currentEntry?.key != key) {
            while (nextEntry != null) {

                if (currentEntry?.key == key) {
                    prevEntry?.next = nextEntry
                    size--
                }

                prevEntry = currentEntry
                currentEntry = nextEntry
                nextEntry = currentEntry.next
            }
        }*/
    }

    class Entry<K, V>(val key: K, var value: V) {
        var next: Entry<K, V>? = null

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as Entry<*, *>

            if (key != other.key) return false
            if (value != other.value) return false
            if (next != other.next) return false

            return true
        }

        override fun hashCode(): Int {
            var result = key?.hashCode() ?: 0
            result = 31 * result + (value?.hashCode() ?: 0)
            result = 31 * result + (next?.hashCode() ?: 0)
            return result
        }
    }

    fun find(array: Entry<Int, Int>?, key: Int): Entry<Int, Int>? {
        var node = array
        var prev: Entry<Int, Int>? = null
        while (node != null && node.key !== key) {
            prev = node
            node = node.next
        }
        return prev
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * var obj = MyHashMap()
 * obj.put(key,value)
 * var param_2 = obj.get(key)
 * obj.remove(key)
 */