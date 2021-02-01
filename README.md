# meta-rubygems

A layer providing gems for ruby

## Tested variants

The following variants are tested regularly

| variant     | glibc                                                                                                                                             | musl                                                                                                                                            |
| ----------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- |
| qemuaarch64 | ![[master]-[glibc]-[qemuaarch64]](https://github.com/priv-kweihmann/meta-rubygems/workflows/%5Bmaster%5D-%5Bglibc%5D-%5Bqemuaarch64%5D/badge.svg) | ![[master]-[musl]-[qemuaarch64]](https://github.com/priv-kweihmann/meta-rubygems/workflows/%5Bmaster%5D-%5Bmusl%5D-%5Bqemuaarch64%5D/badge.svg) |
| qemux86     | ![[master]-[glibc]-[qemux86]](https://github.com/priv-kweihmann/meta-rubygems/workflows/%5Bmaster%5D-%5Bglibc%5D-%5Bqemux86%5D/badge.svg)         | ![[master]-[musl]-[qemux86]](https://github.com/priv-kweihmann/meta-rubygems/workflows/%5Bmaster%5D-%5Bmusl%5D-%5Bqemux86%5D/badge.svg)         |
| qemux86-64  | ![[master]-[glibc]-[qemux86-64]](https://github.com/priv-kweihmann/meta-rubygems/workflows/%5Bmaster%5D-%5Bglibc%5D-%5Bqemux86-64%5D/badge.svg)   | ![[master]-[musl]-[qemux86-64]](https://github.com/priv-kweihmann/meta-rubygems/workflows/%5Bmaster%5D-%5Bmusl%5D-%5Bqemux86-64%5D/badge.svg)   |

other variants most likely will work.
Feel free to contribute any needed patches

## Support

This layer is a rolling release.
Integration is continuously checked against the HEAD of the corresponding poky layer.
Don't expect tags or any kind of versioning

## License

This layer is licensed under `MIT & BSD-2-Clause`.
Newly added recipes are exclusively licensed under `MIT`.

## Add a new gem

Please see [the development README](scripts/README.md) for details
