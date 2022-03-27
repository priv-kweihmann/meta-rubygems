# meta-rubygems

A layer providing gems for ruby

**NOTE**: this branch is currently unmaintained - see [#353](https://github.com/priv-kweihmann/meta-rubygems/issues/353) for details

## Tested variants

The following variants are tested regularly

| variant    | glibc                                                                                                                                     | musl                                                                                                                                    |
| ---------- | ----------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| qemux86-64 | ![[zeus]-[glibc]-[qemux86-64]](https://github.com/priv-kweihmann/meta-rubygems/workflows/%zeus%5D-%5Bglibc%5D-%5Bqemux86-64%5D/badge.svg) | ![[zeus]-[musl]-[qemux86-64]](https://github.com/priv-kweihmann/meta-rubygems/workflows/%zeus%5D-%5Bmusl%5D-%5Bqemux86-64%5D/badge.svg) |

other variants most likely will work.
Feel free to contribute any needed patches

## Support

This layer is a rolling release.
Integration is continuously checked against the HEAD of the corresponding poky layer.
Don't expect tags or any kind of versioning.

### poky release mapping

please check the following table to pick the correct branch matching your poky version

| poky release | suggested meta-rubygems branch | ruby version | maintainer     |
| ------------ | ------------------------------ | ------------ | -------------- |
| master       | master                         | 3.1.x        | priv-kweihmann |
| honister     | hardknott                      | 3.0.x        | n.a.           |
| hardknott    | hardknott                      | 3.0.x        | n.a.           |
| gatesgarth   | dunfell                        | 2.7.x        | n.a.           |
| dunfell      | dunfell                        | 2.7.x        | n.a.           |
| zeus         | zeus                           | 2.5.x        | n.a.           |

## License

This layer is licensed under `MIT & BSD-2-Clause`.
Newly added recipes are exclusively licensed under `MIT`.

## Add a new gem

Please see [the development README](scripts/README.md) for details.
Also please mind the [contribution guideline](CONTRIBUTING.md)
