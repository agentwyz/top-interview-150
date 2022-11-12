const std = @import("std");
const print = std.debug.print;

var a: u8 = 1;

pub fn main() !void
{
    _ = test();
    print("{}", .{a});
}

fn test(a: u8) u8 {
    //不知道
    defer a + 2;
    defer a + 1;
    return a;
}