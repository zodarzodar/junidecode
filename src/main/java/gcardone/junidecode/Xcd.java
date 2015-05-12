/*
 * Copyright (c) 2009, Giuseppe Cardone <ippatsuman@gmail.com>
 * All rights reserved.
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *  * Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *  * Neither the name of the author nor the names of the contributors may be
 *    used to endorse or promote products derived from this software without
 *    specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY GIUSEPPE CARDONE ''AS IS'' AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL GIUSEPPE CARDONE BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */
package gcardone.junidecode;

/**
 * Character map for Unicode characters with codepoint U+CDxx.
 * @author Giuseppe Cardone
 * @version 0.1
 */
class Xcd {

    public static final String[] map = new String[]{
        "cyess", // 0x00
        "cyeng", // 0x01
        "cyej", // 0x02
        "cyec", // 0x03
        "cyek", // 0x04
        "cyet", // 0x05
        "cyep", // 0x06
        "cyeh", // 0x07
        "co", // 0x08
        "cog", // 0x09
        "cogg", // 0x0a
        "cogs", // 0x0b
        "con", // 0x0c
        "conj", // 0x0d
        "conh", // 0x0e
        "cod", // 0x0f
        "col", // 0x10
        "colg", // 0x11
        "colm", // 0x12
        "colb", // 0x13
        "cols", // 0x14
        "colt", // 0x15
        "colp", // 0x16
        "colh", // 0x17
        "com", // 0x18
        "cob", // 0x19
        "cobs", // 0x1a
        "cos", // 0x1b
        "coss", // 0x1c
        "cong", // 0x1d
        "coj", // 0x1e
        "coc", // 0x1f
        "cok", // 0x20
        "cot", // 0x21
        "cop", // 0x22
        "coh", // 0x23
        "cwa", // 0x24
        "cwag", // 0x25
        "cwagg", // 0x26
        "cwags", // 0x27
        "cwan", // 0x28
        "cwanj", // 0x29
        "cwanh", // 0x2a
        "cwad", // 0x2b
        "cwal", // 0x2c
        "cwalg", // 0x2d
        "cwalm", // 0x2e
        "cwalb", // 0x2f
        "cwals", // 0x30
        "cwalt", // 0x31
        "cwalp", // 0x32
        "cwalh", // 0x33
        "cwam", // 0x34
        "cwab", // 0x35
        "cwabs", // 0x36
        "cwas", // 0x37
        "cwass", // 0x38
        "cwang", // 0x39
        "cwaj", // 0x3a
        "cwac", // 0x3b
        "cwak", // 0x3c
        "cwat", // 0x3d
        "cwap", // 0x3e
        "cwah", // 0x3f
        "cwae", // 0x40
        "cwaeg", // 0x41
        "cwaegg", // 0x42
        "cwaegs", // 0x43
        "cwaen", // 0x44
        "cwaenj", // 0x45
        "cwaenh", // 0x46
        "cwaed", // 0x47
        "cwael", // 0x48
        "cwaelg", // 0x49
        "cwaelm", // 0x4a
        "cwaelb", // 0x4b
        "cwaels", // 0x4c
        "cwaelt", // 0x4d
        "cwaelp", // 0x4e
        "cwaelh", // 0x4f
        "cwaem", // 0x50
        "cwaeb", // 0x51
        "cwaebs", // 0x52
        "cwaes", // 0x53
        "cwaess", // 0x54
        "cwaeng", // 0x55
        "cwaej", // 0x56
        "cwaec", // 0x57
        "cwaek", // 0x58
        "cwaet", // 0x59
        "cwaep", // 0x5a
        "cwaeh", // 0x5b
        "coe", // 0x5c
        "coeg", // 0x5d
        "coegg", // 0x5e
        "coegs", // 0x5f
        "coen", // 0x60
        "coenj", // 0x61
        "coenh", // 0x62
        "coed", // 0x63
        "coel", // 0x64
        "coelg", // 0x65
        "coelm", // 0x66
        "coelb", // 0x67
        "coels", // 0x68
        "coelt", // 0x69
        "coelp", // 0x6a
        "coelh", // 0x6b
        "coem", // 0x6c
        "coeb", // 0x6d
        "coebs", // 0x6e
        "coes", // 0x6f
        "coess", // 0x70
        "coeng", // 0x71
        "coej", // 0x72
        "coec", // 0x73
        "coek", // 0x74
        "coet", // 0x75
        "coep", // 0x76
        "coeh", // 0x77
        "cyo", // 0x78
        "cyog", // 0x79
        "cyogg", // 0x7a
        "cyogs", // 0x7b
        "cyon", // 0x7c
        "cyonj", // 0x7d
        "cyonh", // 0x7e
        "cyod", // 0x7f
        "cyol", // 0x80
        "cyolg", // 0x81
        "cyolm", // 0x82
        "cyolb", // 0x83
        "cyols", // 0x84
        "cyolt", // 0x85
        "cyolp", // 0x86
        "cyolh", // 0x87
        "cyom", // 0x88
        "cyob", // 0x89
        "cyobs", // 0x8a
        "cyos", // 0x8b
        "cyoss", // 0x8c
        "cyong", // 0x8d
        "cyoj", // 0x8e
        "cyoc", // 0x8f
        "cyok", // 0x90
        "cyot", // 0x91
        "cyop", // 0x92
        "cyoh", // 0x93
        "cu", // 0x94
        "cug", // 0x95
        "cugg", // 0x96
        "cugs", // 0x97
        "cun", // 0x98
        "cunj", // 0x99
        "cunh", // 0x9a
        "cud", // 0x9b
        "cul", // 0x9c
        "culg", // 0x9d
        "culm", // 0x9e
        "culb", // 0x9f
        "culs", // 0xa0
        "cult", // 0xa1
        "culp", // 0xa2
        "culh", // 0xa3
        "cum", // 0xa4
        "cub", // 0xa5
        "cubs", // 0xa6
        "cus", // 0xa7
        "cuss", // 0xa8
        "cung", // 0xa9
        "cuj", // 0xaa
        "cuc", // 0xab
        "cuk", // 0xac
        "cut", // 0xad
        "cup", // 0xae
        "cuh", // 0xaf
        "cweo", // 0xb0
        "cweog", // 0xb1
        "cweogg", // 0xb2
        "cweogs", // 0xb3
        "cweon", // 0xb4
        "cweonj", // 0xb5
        "cweonh", // 0xb6
        "cweod", // 0xb7
        "cweol", // 0xb8
        "cweolg", // 0xb9
        "cweolm", // 0xba
        "cweolb", // 0xbb
        "cweols", // 0xbc
        "cweolt", // 0xbd
        "cweolp", // 0xbe
        "cweolh", // 0xbf
        "cweom", // 0xc0
        "cweob", // 0xc1
        "cweobs", // 0xc2
        "cweos", // 0xc3
        "cweoss", // 0xc4
        "cweong", // 0xc5
        "cweoj", // 0xc6
        "cweoc", // 0xc7
        "cweok", // 0xc8
        "cweot", // 0xc9
        "cweop", // 0xca
        "cweoh", // 0xcb
        "cwe", // 0xcc
        "cweg", // 0xcd
        "cwegg", // 0xce
        "cwegs", // 0xcf
        "cwen", // 0xd0
        "cwenj", // 0xd1
        "cwenh", // 0xd2
        "cwed", // 0xd3
        "cwel", // 0xd4
        "cwelg", // 0xd5
        "cwelm", // 0xd6
        "cwelb", // 0xd7
        "cwels", // 0xd8
        "cwelt", // 0xd9
        "cwelp", // 0xda
        "cwelh", // 0xdb
        "cwem", // 0xdc
        "cweb", // 0xdd
        "cwebs", // 0xde
        "cwes", // 0xdf
        "cwess", // 0xe0
        "cweng", // 0xe1
        "cwej", // 0xe2
        "cwec", // 0xe3
        "cwek", // 0xe4
        "cwet", // 0xe5
        "cwep", // 0xe6
        "cweh", // 0xe7
        "cwi", // 0xe8
        "cwig", // 0xe9
        "cwigg", // 0xea
        "cwigs", // 0xeb
        "cwin", // 0xec
        "cwinj", // 0xed
        "cwinh", // 0xee
        "cwid", // 0xef
        "cwil", // 0xf0
        "cwilg", // 0xf1
        "cwilm", // 0xf2
        "cwilb", // 0xf3
        "cwils", // 0xf4
        "cwilt", // 0xf5
        "cwilp", // 0xf6
        "cwilh", // 0xf7
        "cwim", // 0xf8
        "cwib", // 0xf9
        "cwibs", // 0xfa
        "cwis", // 0xfb
        "cwiss", // 0xfc
        "cwing", // 0xfd
        "cwij", // 0xfe
        "cwic" // 0xff
    };
}
