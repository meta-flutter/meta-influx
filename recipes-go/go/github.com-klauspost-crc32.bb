DESCRIPTION = "github.com/klauspost/crc32"

GO_IMPORT = "github.com/klauspost/crc32"

inherit go

SRC_URI = "git://github.com/klauspost/crc32;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "cb6bfca970f6908083f26f39a79009d608efd5cd" 
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=0f63a5a579a75ddec9f3464b085818a4"

FILES:${PN} += "${GOBIN_FINAL}/*"
