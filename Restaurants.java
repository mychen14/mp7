import java.util.ArrayList;
public class Restaurants {
	/**
	 * Name.
	 */
	private String name;
	/**
	 * average Price.
	 */
	private double averagePrice;
	/**
	 * distance.
	 */
	private double distanceFromQuad;
	/**
	 * the cuisine type.
	 */
	private String cuisineType;
	/**
	 * rating.
	 */
	private double rating;


	public Restaurants(String myName, double price, double distance, String cuisine, double theRating) {
	    this.name = myName;
	    this.averagePrice = price;
	    this.distanceFromQuad = distance;
	    this.cuisineType = cuisine;
	    this.rating = theRating;
	}

	public Restaurants(double price, double distance, String cuisine, float theRating) {
	    this.averagePrice = price;

	    this.distanceFromQuad = distance;
	    this.cuisineType = cuisine;
	    this.rating = theRating;
	}

	public void compareRatings(Restaurants restaurant1) {
	    if (this.rating > restaurant1.rating) {
	        System.out.println(this.name + "," + this.rating);
	    }
	    if(this.rating < restaurant1.rating) {
	        System.out.println(restaurant1.name + "," + restaurant1.rating);
	    }
	}

	public String getCuisineType() {
	    return this.cuisineType;
	}

	public String getName() {
	    return this.name;
	}

	public void getAveragePrice() {
	    System.out.println(this.averagePrice);
	}

	public double distanceFromQuad() {
	    return this.distanceFromQuad;
	}

	public double getRating() {
	    return this.rating;
	}

	public void compareDistance(Restaurants restaurant1) {
	    if (this.distanceFromQuad < restaurant1.distanceFromQuad) {
	        System.out.println(this.name + "," + this.distanceFromQuad);
	    } else {
	        System.out.println(restaurant1.name + "," + restaurant1.distanceFromQuad);
	    }
	}

	public String[] withinPriceRange(Restaurants[] myRestaurants, double high) {
	    String[] possibleFood = new String[myRestaurants.length];
	    for (int i = 0; i < myRestaurants.length; i++) {
	        if (myRestaurants[i].averagePrice <= high) {
	            possibleFood[i] = myRestaurants[i].name;
	        } else {
	            possibleFood[i] = null;
	        }
	    }
	    return possibleFood;
	}

	public String[] withinDistance(Restaurants[] myRestaurants, double maxDistance) {
	    String[] possibleRestaurants = new String[myRestaurants.length];
	    for (int i = 0; i < myRestaurants.length; i++) {
	        if (myRestaurants[i].distanceFromQuad <= maxDistance) {
	            possibleRestaurants[i] = myRestaurants[i].name;
	        } else {
	            possibleRestaurants[i] = null;
	        }
	    }
	    for (int i = 1; i < possibleRestaurants.length; i++) {
	        if (possibleRestaurants[i - 1] == null && possibleRestaurants[i] != null) {
	           for (int j = i; j < possibleRestaurants.length; j++) {
	               possibleRestaurants[j - 1] = possibleRestaurants[j];
	           }
	           possibleRestaurants[possibleRestaurants.length - 1] = null;
	        }
	    }
	    return possibleRestaurants;
	}

	public String[] typeOfCuisine(Restaurants[] myRestaurants, String cuisine) {
	    String[] possibleFood = new String[myRestaurants.length];
	    for (int i = 0; i < myRestaurants.length; i++) {
	        if (myRestaurants[i].cuisineType == cuisine) {
	            possibleFood[i] = myRestaurants[i].name;
	        } else {
	            possibleFood[i] = null;
	        }
	    }
	    return possibleFood;
	}
	/**
	 * Menu.
	 */
	public class Menu {

	    private ArrayList<MenuItem> appetizers;
	    private ArrayList<MenuItem> entrees;
	    private ArrayList<MenuItem> beverages;
	    private ArrayList<MenuItem> desserts;
	    /**
	     * MenuItem.
	     */
	    public class MenuItem {
	        private String name;
	        private double price;
	        private boolean spicy;
	        private boolean vegetarian;
	        private boolean organic;

	        
	        /**
	         *
	         * @return return
	         */
	        public String getName() {
	            return this.name;
	        }
	        /**
	         *
	         * @param a a
	         */
	        public void setName(final String a) {
	            this.name = a;
	        }
	        /**
	         *
	         * @return return
	         */
	        public double getPrice() {
	            return this.price;
	        }
	        /**
	         *
	         * @param a a
	         */
	        public void setPrice(final double a) {
	            this.price = a;
	        }
	        /**
	        *
	        * @return return
	        */
	        public boolean getSpicy() {
	            return this.spicy;
	        }
	        /**
	        *
	        * @param a a
	        */
	        public void setSpicy(final boolean a) {
	            this.spicy = a;
	        }
	        /**
	        *
	        * @return return
	        */
	        public boolean getVegetarian() {
	            return this.vegetarian;
	        }
	        /**
	        *
	        * @param a a
	        */
	        public void setVegetarian(final boolean a) {
	            this.vegetarian = a;
	        }
	        /**
	        *
	        * @return return
	        */
	        public boolean getOrganic() {
	            return this.organic;
	        }
	        /**
	        *
	        * @param a a
	        */
	        public void setOrganic(final boolean a) {
	            this.organic = a;
	        }
	        public class Appetizer extends MenuItem {
	        	/**
	            *
	            * @param a a
	            * @param b b
	            */
	           public Appetizer(final String a, final double b) {
	               super.name = a;
	               super.price = b;
	               appetizers.add(this);
	           }
	           /**
	            *
	            * @param a a
	            * @param b b
	            * @param c c
	            */
	           public Appetizer(final String a, final double b, final boolean c) {
	               super.name = a;
	               super.price = b;
	               super.spicy = c;
	               appetizers.add(this);
	           }
	           /**
	            *
	            * @param a a
	            * @param b b
	            * @param c c
	            * @param d d
	            */
	           public Appetizer(final String a, final double b, final boolean c, final boolean d) {
	        	   		super.name = a;
	        	   		super.price = b;
	        	   		super.spicy = c;
	        	   		super.vegetarian = d;
	        	   		appetizers.add(this);
	           }
	           /**
	            *
	            * @param a a
	            * @param b b
	            * @param c c
	            * @param d d
	            * @param e e
	            */
	           public Appetizer(final String a, final double b, final boolean c,
	                   final boolean d, final boolean e) {
	        	   		super.name = a;
	        	   		super.price = b;
	        	   		super.spicy = c;
	        	   		super.vegetarian = d;
	        	   		super.organic = e;
	        	   		appetizers.add(this);
	           }
	        }
	       
	        public class Entree extends MenuItem {
	        	public Entree(final String a, final double b) {
	                super.name = a;
	                super.price = b;
	                entrees.add(this);
	            }
	            /**
	             *
	             * @param a a
	             * @param b b
	             * @param c c
	             */
	            public Entree(final String a, final double b, final boolean c) {
	                super.name = a;
	                super.price = b;
	                super.spicy = c;
	                entrees.add(this);
	            }
	            /**
	             *
	             * @param a a
	             * @param b b
	             * @param c c
	             * @param d d
	             */
	            public Entree(final String a, final double b, final boolean c, final boolean d) {
	         	   	super.name = a;
	         	   	super.price = b;
	         	   	super.spicy = c;
	         	   	super.vegetarian = d;
	         	   	entrees.add(this);
	            }
	            /**
	             *
	             * @param a a
	             * @param b b
	             * @param c c
	             * @param d d
	             * @param e e
	             */
	            public Entree(final String a, final double b, final boolean c,
	                    final boolean d, final boolean e) {
	         	   	super.name = a;
	         	   	super.price = b;
	         	   	super.spicy = c;
	         	   	super.vegetarian = d;
	         	   	super.organic = e;
	         	   	entrees.add(this);
	            }
	        }
	        
	        public class Dessert extends MenuItem {
	        	public Dessert(final String a, final double b) {
	                super.name = a;
	                super.price = b;
	                desserts.add(this);
	            }
	            /**
	             *
	             * @param a a
	             * @param b b
	             * @param c c
	             */
	            public Dessert(final String a, final double b, final boolean c) {
	                super.name = a;
	                super.price = b;
	                super.spicy = c;
	                desserts.add(this);
	            }
	            /**
	             *
	             * @param a a
	             * @param b b
	             * @param c c
	             * @param d d
	             */
	            public Dessert(final String a, final double b, final boolean c, final boolean d) {
	         	   	super.name = a;
	         	   	super.price = b;
	         	   	super.spicy = c;
	         	   	super.vegetarian = d;
	         	   	desserts.add(this);
	            }
	            /**
	             *
	             * @param a a
	             * @param b b
	             * @param c c
	             * @param d d
	             * @param e e
	             */
	            public Dessert(final String a, final double b, final boolean c,
	                    final boolean d, final boolean e) {
	         	   	super.name = a;
	         	   	super.price = b;
	         	   	super.spicy = c;
	         	   	super.vegetarian = d;
	         	   	super.organic = e;
	         	   	desserts.add(this);
	            }
	        }
	        public class Beverage extends MenuItem {
	        	public Beverage(final String a, final double b) {
	                super.name = a;
	                super.price = b;
	                beverages.add(this);
	            }
	            /**
	             *
	             * @param a a
	             * @param b b
	             * @param c c
	             */
	            public Beverage(final String a, final double b, final boolean c) {
	                super.name = a;
	                super.price = b;
	                super.spicy = c;
	                beverages.add(this);
	            }
	            /**
	             *
	             * @param a a
	             * @param b b
	             * @param c c
	             * @param d d
	             */
	            public Beverage(final String a, final double b, final boolean c, final boolean d) {
	         	   	super.name = a;
	         	   	super.price = b;
	         	   	super.spicy = c;
	         	   	super.vegetarian = d;
	         	   	beverages.add(this);
	            }
	            /**
	             *
	             * @param a a
	             * @param b b
	             * @param c c
	             * @param d d
	             * @param e e
	             */
	            public Beverage(final String a, final double b, final boolean c,
	                    final boolean d, final boolean e) {
	         	   	super.name = a;
	         	   	super.price = b;
	         	   	super.spicy = c;
	         	   	super.vegetarian = d;
	         	   	super.organic = e;
	         	   	beverages.add(this);
	            }
	        }
	    }

	}

}
