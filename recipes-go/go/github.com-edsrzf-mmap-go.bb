DESCRIPTION = "github.com/edsrzf/mmap-go"

GO_IMPORT = "github.com/edsrzf/mmap-go"

inherit go

SRC_URI = "git://github.com/edsrzf/mmap-go;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "0bce6a6887123b67a60366d2c9fe2dfb74289d2e" 
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=8c3f6072b212265c9f4b89a0c247b169"

FILES:${PN} += "${GOBIN_FINAL}/*"
