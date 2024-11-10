// SPDX-License-Identifier: Apache-2.0
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package site.srht.kurth4cker;

public final class Main {
    public static void main(String[] args) {
        var greeting = Hello.greeting();
        System.out.println(greeting);

        var bye = Hello.bye();
        System.out.println(bye);
    }
}
