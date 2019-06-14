# CYWWTAIP
### color your world with this AI project

An AI for Games project as part of the International Media and Computing Course "AI for Games and Interactive Systems" by Prof. Dr. Tobias Lenz at HTW Berlin

What you need to know:

	 * Energy lasts 10sec (linear consumption) - any bot can recharge team energy by passing charging zone
	 * less energy will reduce bot speed (never less than 20%) 
	 * Sphere radius = 1, charging zones are located at x or y or z > 0.94
	 * Full speed = 0.024 units/20ms

	 * each team consists of 3 bots
	 * Bot 0 - unicolor - 100% speed - colors own position
	 * Bot 1 - doted - 66% speed - colors own position - can go through obstacles
	 * Bot 2 - striped - 42% speed - colors own position and neighbors

